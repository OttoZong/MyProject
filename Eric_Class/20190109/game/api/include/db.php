<?php
//数据库设定
$link = mysql_connect("gdp.cluster-ctl3cvytcvbx.ap-northeast-1.rds.amazonaws.com","gdp","1qaz2wsx") or die ("connect Error");

$db_main = "gdp";


$db_select = mysql_select_db($db_main) or die("error!");
$db_sht = array(
	"fb_member" => "fb_member",
	"member" => "member",
	"top_board" => "top_board"
);
mysql_query("SET CHARACTER SET utf8");

?>
