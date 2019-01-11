<?php
/*
Coins api

*/
include "../include/db.php";



$act = $_GET['act'];

switch ($act)
{
	case "reg":	//註冊
	
		$account = $_POST['account'];
		$password = $_POST['password'];
		
		
		if (!$account && !$password)
		{
			$status = "value is null";
		}else
		{
		
				//先判斷有沒有註冊過
				$sql = "select *
									from ".$db_sht[member]."
									where account = '".$account."'
								";
								$res = mysql_query($sql);
								$row = mysql_fetch_array($res);	
								$check_id = $row[id];
									
				if (!$check_id)
				{
					$password = md5($password);
					
					$sql = "insert into ".$db_sht[member]." set
								account = '".$account."',
								password = '".$password."',
								reg_time = '".date("Y-m-d H:i:s")."'
								";
					$res = mysql_query($sql);
					
					$status = "success";
					
				}else
				{
						$status = "re";
				}
		
		}
		
		
		$show_ay = array();
		$show_ay[status] = $status;
		$show_ay[account] = $account;
		$show_ay[reg_time] = date("Y-m-d H:i:s");
		
						
		
		echo json_encode($show_ay);
		exit;
		
		break;
	
	case "login":	//登入
		
		$account = $_POST['account'];
		$password = $_POST['password'];
		
		if (!$account && !$password)
		{
			$status = "value is null";
		}else
		{
		
				//先判斷有沒有註冊過
				$sql = "select *
									from ".$db_sht[member]."
									where account = '".$account."' and password = '".md5($password)."'
								";
								$res = mysql_query($sql);
								$row = mysql_fetch_array($res);	
								$check_id = $row[id];
								$point = $row[point];
									
				if ($check_id)
				{
						$status = "success";		
						
						$sql = "update ".$db_sht[member]." set
								login_time = '".date("Y-m-d H:i:s")."'
								where id = '".$check_id."'";	
			$res = mysql_query($sql);		
				}else
				{
						$status = "account error";
				}
		
		}
		
		
		$show_ay = array();
		$show_ay[status] = $status;
		$show_ay[account] = $account;
		$show_ay[point] = $point;
		$show_ay[login_time] = date("Y-m-d H:i:s");
		
						
		
		echo json_encode($show_ay);
		exit;
		
		break;
		
	
		
	default:
		echo "no";
		break;
}







?>