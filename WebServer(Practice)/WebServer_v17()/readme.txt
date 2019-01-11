重構HttpRequest類,添加對Post請求形式中對form表單數據的解析功能.

對於form表單提交,有兩種方法,get,post.

例如:
<form action="xxx" method="get">...</form>
<form action="xxx" method="post">...</form>

get請求會將form表單中所有輸入框內容體現在地址欄中.
post請求會將form表單中的內容放在請求中的消息正文部分.
並在消息頭中添加相關的頭信息,告知服務端這是含有form表單的post請求.
通常向註冊,登錄這樣的功能會包含用戶隱私信息的請求,
form都是使用post請求提交表單數據的.



當新增一個功能時,我們需要做以下操作:
1.針對功能添加一個頁面,
     比如:
  webapps/web/web/register.html.
     添加form表單,指定action的提交請求路徑.
2.添加一個新的Servlet類來處理這個請求,
     比如:
  com.tedu.servlets.WebRegServlet.
3.在映射文件中添加請求對對應Servlet的關係,
     修改ServletMapping.xml文件,添加一個新的子標籤.
     例如:
  	<mapping uri="/web/web/reg" classname="com.tedu.servlets.WebRegServlet"/>
4.實現該Servlet的service方法,完成註冊功能.  	
  	
  	