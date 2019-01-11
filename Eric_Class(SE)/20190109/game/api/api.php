<?php
/*
api

*/
include "./include/db.php";



$act = $_GET['act'];


switch ($act)
{
	case "login":	//登入判斷
	
		$fb_id = $_POST['fb_id'];
		$nickname = $_POST['name'];
		$email = $_POST['email'];
		
		if (!$fb_id)
		{
			echo "error";
			exit;
		}
		
		//先判斷有沒有寫入過
		$sql = "select *
							from ".$db_sht[fb_member]."
							where fb_id = '".$fb_id."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$check_id = $row[id];
						$update_time = substr($row[update_time],0,10);
							
		if (!$check_id)
		{
			//寫入 +首次登入送10點
			$sql = "insert into ".$db_sht[fb_member]." set
						fb_id = '".$fb_id."',
						nickname = '".$nickname."',
						email = '".$email."',
						add_time = '".date("Y-m-d H:i:s")."',
						point = '10'
						";
			$res = mysql_query($sql);
		}else
		{		
				//每天登入送10點
				if ($update_time != date("Y-m-d"))
				{
					$sql = "update ".$db_sht[fb_member]." set
											point  = point + '10',
											update_time = '".date("Y-m-d H:i:s")."'
											where fb_id = '".$fb_id."'";	
					$res = mysql_query($sql);
				}
				
				
		}
		
		
		//抓最新資料
			$sql = "select *
							from ".$db_sht[fb_member]."
							where fb_id = '".$fb_id."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$point = $row[point];
						
		if (!$point)
		{
			$point = 0;
		}
		
		$show_ay = array();
		$show_ay[fb_id] = $fb_id;
		$show_ay[point] = $point;
		
						
		
		echo json_encode($show_ay);
		exit;
		
		break;
		
	case "check_point":	//抓取當前點數
		
		$game_point = 3;	//玩一次扣3點
	
		$fb_id = $_POST['fb_id'];
		
		if (!$fb_id)
		{
			echo "error";
			exit;
		}
		
		$sql = "select *
							from ".$db_sht[fb_member]."
							where fb_id = '".$fb_id."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$point = $row[point];
		
		if (!$point)
		{
			$point = 0;
		}
		
		$new_point = $point - $game_point;
		
		//判斷點數夠不夠
		if ($new_point >= 0)
		{
			$status = "success";
			$show_point = $point;
		}else
		{
			$status = "no_point";
			$show_point = $point;
		}
		
		$show_ay = array(
			'fb_id' => $fb_id,
			'status' => $status,
			'show_point' => $point
		);
		
		echo json_encode($show_ay);
		exit;
		
		break;
		
		
	case "play":	//抓取2位數號碼
	
	
		$fb_id = $_POST['fb_id'];
		//$fb_id = '454579948384248';
		
		if (!$fb_id)
		{
			echo "error";
			exit;
		}
		
		$seed = array(60,30,3,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);	// 機率種子
		$value = array(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);		// 取得值的機率 - 對應位置
		$outAry = getProbValue($seed, $value, 100);
		
		$bar_number = $outAry[0];
		
		
		
		$game_point = 3;	//玩一次扣3點
		
		//先判斷點數還夠不夠
		
		$sql = "select *
							from ".$db_sht[fb_member]."
							where fb_id = '".$fb_id."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$point = $row[point];
						$check_id = $row[id];
		
		$new_point = $point - $game_point;
		
		
		if ($new_point < 0)
		{
			$status = "no_point";	//沒有足夠的點數！
			
			$show_ay = array(
				'fb_id' => $fb_id,
				'status' => $status,
				'show_point' => $point
			);
			
		}else
		{
			
			$status = "success";	//
			
			$new_point = $new_point + $bar_number;
			
			//更新point
			$sql = "update ".$db_sht[fb_member]." set
								point = '".$new_point."'
								where fb_id = '".$fb_id."'";	
			$res = mysql_query($sql);
			
			//寫入贏的記錄
			$play_date = date("Y-m-d");
			
			$sql = "select *
							from ".$db_sht[top_board]."
							where fb_id = '".$check_id."' and play_date = '".$play_date."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$check_board = $row[id];
			
			if ($check_board)
			{
				//寫入更新排行
				$sql = "update ".$db_sht[top_board]." set
								point = point + '".$bar_number."'
								where id = '".$check_board."'";	
				$res = mysql_query($sql);
			}else
			{
				//寫入排行
				$sql = "insert into ".$db_sht[top_board]." set
						fb_id = '".$check_id."',
						point = '".$bar_number."',
						play_date = '".$play_date."'					
						";
				$res = mysql_query($sql);
			}
		
			$show_ay = array(
				'fb_id' => $fb_id,
				'status' => $status,
				'bar_number' => $bar_number,
				'show_point' => $new_point
			);
		}
		//show json
		
		
		echo json_encode($show_ay);
		exit;
		
		
		
		
		break;
		
	case "top_board": //top_board排行榜
		
		$sql = "select *
			from ".$db_sht[top_board]."		
			group by play_date
			order by play_date desc
		";
		$res = mysql_query($sql);
		$i = 0;
		while ($row = mysql_fetch_array($res)) {
			//$member_sql[$i][id] = $row[id];
			$member_sql[$i][play_date] = $row[play_date];
			$i++;	
		}
		
		//$play_d = array();
		
		for ($i=0;$i<count($member_sql);$i++)
		{
			$show_det[$i] = get_board_det($member_sql[$i][play_date]);
			$member_sql[$i][fb_man] = $show_det[$i];
			
			//array_push($play_d[$i][fb_man],get_board_det($member_sql[$i][play_date]));
			//echo $member_sql[$i][play_date]."<br>";
		}
		//print_r($member_sql);
		echo json_encode($member_sql);
		exit;
		
		break;
	
	case "check_info":	//確認是否有參加過個人資料任務
		
		$fb_id = $_POST['fb_id'];
		
		$sql = "select *
							from ".$db_sht[fb_member]."
							where fb_id = '".$fb_id."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$gender = $row[gender];
						$birthday = $row[birthday];					
						$job = $row[job];
		
		if ($gender && $birthday && $job)
		{
			$status = "yes";	//有參加過
		}else
		{
			$status = "no";	//沒參加過
		}
		
		$show_ay = array(
				'fb_id' => $fb_id,
				'status' => $status
			);
		
		//show json
		
		
		echo json_encode($show_ay);
		exit;
		
		break;
		
	case "add_info":	//填寫基本資料
		
		$fb_id = $_POST['fb_id'];
		
		$gender = $_POST['gender'];
		$birthday = $_POST['birthday'];
		$job = $_POST['job'];
		
		if (!$fb_id)
		{
			echo "error";
			exit;
		}
		
		if ($gender && $birthday && $job)
		{
			$sql = "update ".$db_sht[fb_member]." set
											point  = point + '5',
											gender = '".$gender."',
											birthday = '".$birthday."',
											job = '".$job."'
											where fb_id = '".$fb_id."' and birthday = '0000-00-00'";	
			$res = mysql_query($sql);
			
			$status = "success";
		}else
		{
			$status = "no";
		}
		
		$show_ay = array(
				'fb_id' => $fb_id,
				'status' => $status
			);
		
		//show json
		echo json_encode($show_ay);
		exit;	
		break;
		
	case "share":	//分享貼文
		$fb_id = $_POST['fb_id'];
		
		if (!$fb_id)
		{
			echo "error";
			exit;
		}
		
		//判斷是否分享過
		$sql = "select *
							from ".$db_sht[fb_member]."
							where fb_id = '".$fb_id."'
						";
						$res = mysql_query($sql);
						$row = mysql_fetch_array($res);	
						$share_time = $row[share_time];
			
			if ($share_time == "0000-00-00")
			{
				$sql = "update ".$db_sht[fb_member]." set
											point  = point + '4',
											share_time = '".date("Y-m-d")."'
											where fb_id = '".$fb_id."'";	
				$res = mysql_query($sql);
				
				$status = "success";
			}else
			{
				$status = "re";
			}
		
		$show_ay = array(
				'fb_id' => $fb_id,
				'status' => $status
			);
		
		//show json
		echo json_encode($show_ay);
		exit;	
		break;
		
		break;
	
	case "test":	//幫auto 加錢
		
		$fb_id = "1475625275872297";
		//print_r($outAry);
		$sql = "update ".$db_sht[fb_member]." set
								point = point + '10'
								where fb_id = '".$fb_id."'";	
			$res = mysql_query($sql);
		
		break;
		
	case "demo":
		
		$ay = array(
			array("date" => "2018-09-01", "user" => array(0 => "aaa", 1 => "bbb", 2 => "ccc")),
			array("date" => "2018-09-02", "user" => array(0 => "ddd",1 => "eee", 2 => "fff")),
			array("date" => "2018-09-03", "user" => array(0 => "ggg", 1 => "kkk", 2 => "xxx"))
			
		);
		
		echo json_encode($ay);
		exit;
		break;
		
	default:
		echo "no";
		break;
}


//日期裡面的排行榜
function get_board_det($play_date)
{
	include "./include/db.php";
	
		$sql = "select b.email,a.point
			from ".$db_sht[top_board]." as a , ".$db_sht[fb_member]." as b
			where a.fb_id = b.id and
			a.play_date = '".$play_date."'
			order by a.point desc
			limit 0,3
		";
		$res = mysql_query($sql);
		$i = 0;
		while ($row = mysql_fetch_array($res)) {
			$member_sql[$i][email] = $row[email];
			$member_sql[$i][point] = $row[point];
			$i++;	
		}
		
		$fb_man = array();
		for ($i=0;$i<count($member_sql);$i++)
		{
			
			$member_sql[$i][email_hid] = replace_symbol_text($member_sql[$i][email],'*',3,2); //te*********om
			array_push($fb_man, $member_sql[$i][email_hid]."_".$member_sql[$i][point]);
			
		}
		
		return $fb_man;
}

/* 機率性取得特定值
 * $seed > 機率種子 - 對應 $value 各值取得機率。
 * $value > 取得值 - 對應 $seed 的機率。
 * ex: $seed = array(40, 30, 15, 10, 5); $value = array(1, 2, 3, 4, 5);
 * 表示得到 1 的機率為 40%、得到 2 的機率為 30%、...。
 * $precent > N分之一, 預設 100
 */
function getProbValue($seed, $value, $precent=100) {
	$outAry = array();	// 取值表 - 隨機塞值
	$idxAry = array();	// 索引陣列 - 用在不重複取得索引位置
	
	// 取得值的個數 和 機率種子個數不符時 重新設定機率種子
	if(count($seed) != count($value)) {
		$tmp = 0;
		$seed = array();
		$num = count($value);
		$pre = (int)($precent / $num);
		for($i = 0; $i < $num; $i++) {
			$seed[$i] = $pre;
			$tmp += $pre;
			if($i == $num-2 && $tmp < $precent)
				$pre = $precent - $tmp;
		}
	}
			
	while(count($idxAry) != $precent) {
		$idx = rand(0, $precent-1);
		if(!in_array($idx, $idxAry))
			$idxAry[] = $idx;
	}
	
	$count = 0;
	for($i = 0; $i < count($value); $i++) {
		for($j = 0; $j < $seed[$i]; $j++) {
			$outAry[$idxAry[$count]] = $value[$i];
			$count++;
		}
	}
	

	ksort($outAry);	// 依 key 值排序 min > max

	unset($idxAry);
	return $outAry;
}

//隱藏
function replace_symbol_text($string,$symbol,$begin_num = 0,$end_num = 0){
	$string_length = strlen($string);
	$begin_num = (int)$begin_num;
	$end_num = (int)$end_num;
	$string_middle = '';
	
	$check_reduce_num = $begin_num + $end_num;
	
	if($check_reduce_num >= $string_length){
	for ($i=0; $i < $string_length; $i++) {
	$string_middle .= $symbol;
	}
	return $string_middle;
	}
	
	$symbol_num = $string_length - ($begin_num + $end_num);
	$string_begin = substr($string, 0,$begin_num);
	$string_end = substr($string, $string_length-$end_num);
	
	for ($i=0; $i < $symbol_num; $i++) {
	$string_middle .= $symbol;
	}

return $string_begin.$string_middle.$string_end;
} 
?>