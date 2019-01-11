$(function() {
  // 如果有登入，隱藏Form01、顯示Form02
  //開始玩
  $("button#gameplay").click(function() {
    if ($('#fb_id').val() != "") {
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
    }	//end if status
	});

  //回上頁
  $("button#back").click(function() {
    $("#form02").hide();
    $("#form01").show();
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
            $("#playshow").show();
            $("#now_point").show();
              $("#total_point").val(data.show_point+ " point");
              $("#total_point").show();
        } else {
          $("#point").val(data.show_point+ " point");
          alert("您目前的點數餘額不足！！");
            $("#playshow").hide();
            $("#Getpoint").hide();
            $("#total_point").hide();
            $("#text01").hide();

        }

      }
    });
}
