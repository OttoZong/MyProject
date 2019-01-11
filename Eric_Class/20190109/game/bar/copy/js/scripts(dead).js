$(function() {
  // 進入遊戲，先判斷持有點數大於等於3，再判斷玩家身分
  // 如果有登入，隱藏Form01、顯示Form02
  $("button#gameplay").click(function() {
      $.ajax({
        url: '../api.php?act=check_point',
        type: 'post',
        data: {
           fb_id:$("#fb_id").val()
        },
        dataType:'json',
        success:function(data){
        console.log(data);
        }

          // if (data.point < 3 ){
          //   alert("您持有點數不足三點！！")
          // } else {
          //   // 判斷玩家身分
          //   if ($("#fb_id").val() != "") {
          //         $("#form01").hide();
          //         $("#form02").show();
          //   } else {
          //     alert("請登入Facebook！！");
          //   }
          // }
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
      // $("#point").val(data.point);
        // alert("您持有的點數不足！！")
      }
    });
}

// $(function() {
//   $("button#play").click(function() {
//
//
//   }
      // $("#playshow").hide(1000);

      // if (data.status == "success") {
      //   $("#playshow").show(2000);
      //     $("#Getpoint02").val(data.bar_number);
      //     alert("您贏得"  + data.bar_number + "point，共計" + data.show_point + "point");
  // });




// 回到Form01畫面，將Form02隱藏，Form01顯示
$(function(){
  $("button#back").click(function() {
    $("#form02").hide();
    $("#form01").show();
  });
});
