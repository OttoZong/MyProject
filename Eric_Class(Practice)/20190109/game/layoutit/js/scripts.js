$(function() {
  // if loging，hide Form01、show Form02
  // start play
  $("button#gameplay").click(function() {
    $("playtext").hide();
    $("playshow").hide();
    $("#Getpoint").hide();
    $("#text").hide();
      if ($('#fb_id').val() != "" ){
        $.ajax({
          url: '../api.php?act=check_point',
          type: 'post',
          data: {
             fb_id:$("#fb_id").val()
          },
          dataType:'json',
          success:function(data){
            console.log(data);

            $("#point").val(data.show_point + " point");

            if (data.status == "success") {
                $("#form01").hide();
                $("#form02").show();
            } else {
              $("#point").val(data.show_point + " point");
              alert("您的點數餘額不足！！");
            }

          }	//end success


        });	// end ajax
      } else {
        alert("您尚未登入Facebook！！");
      }	// end if status
	});

});

  // 請求Json，確認玩家身分
function play(){
    $.ajax({
      url: '../api.php?act=play',
      type: 'post',
      data: {
         fb_id:$("#fb_id").val()
      },
      dataType:'json',
      success:function(data){ // http code 200
        console.log(data);
        if (data.status == "success") {
          $("#Getpoint").val(data.bar_number + " point");
            $("#point").val(data.show_point + " point");
            $("playtext").show();
            $("playshow").show();
            $("#Getpoint").show();
            $("#text").show();

            $("#total_point").val(data.show_point + " point");
        } else {
          $("#point").val(data.show_point + " point");
          alert("您目前的點數餘額不足！！");
            $("#Getpoint").hide();
            $("#playshow").hide();


        }
      }
    });
}

// ==== 寫入個人資料 API ====
//check user info
function sent(){

	//判斷資料輸入
	if ($('input[name=gender]:checked').val() === undefined )
	{
		alert("請選擇性別");
		return false;
  }
    else if ($('input[name=birthday]').val() === "" )
    {
    alert("請輸入年齡");
    return false;
    }
      else if($('input[name=job]').val() === "" )
      {
      alert("請輸入職業");
      return false;
	   }


    $.ajax({
      url: '../api.php?act=check_info',
      type: 'post',
      data: {
        fb_id: $("#fb_id").val(),
        // fb_id: response.fb_id

      // 傳送參數：fb_id
      // 我會回你 status: yes  or  no
      },
      dataType:'json',
      success:function(data){
        //console.log(data);

        check_info(data.status);	//傳送第二次,新增 add_info
      }

    });
  }

//寫入個人資料
function check_info(st)
{

	//console.log($('input[name=gender]:checked').val()+'-'+$("#birthday").val()+'-'+$("#job").val());

	if (st == "no") {
          $.ajax({
            url: '../api.php?act=add_info',
            type: 'post',
            dataType: 'json',
            data: {
              fb_id: $("#fb_id").val(),
              gender: $('input[name=gender]:checked').val(),
              birthday: $("#birthday").val(),
              job: $("#job").val()
            },
            success:function(data){
              //console.log(data);
              alert("您已成功輸入個人資料");
            }
          });
        } else {
          alert("您已經參加過本次任務");
        }
}

// concol form03 && check fb login
function mission(){
  if ($("#fb_id").val() != "")
  {
    $("#form03").show();
    $("#form01").hide();
  } else{
    alert("您尚未登入Facebook！！");
  }

}

// back index
function back(){
  $("#form01").show();
  $("#form02").hide();
  $("#form03").hide();
}
