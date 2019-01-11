1.Servlet容器如何處理請求資源路徑？
比如，在瀏覽器地址欄輸入
http://ip:port/servlet-day04/abc.html

Step1.容器認為訪問的是一個Servlet
    從web.xml文件中去查找是否有匹配的Servlet的。

Step2.匹配方式：
    方式一：精確匹配
        請求地址與url-pattern的完全一致。
    方式二：通配符匹配
          <url-pattern>/*</url-pattern>
        注：*匹配零個或者多個字符。
         <url-pattern>/abc/*</url-pattern>
    方式三：後綴匹配
       <url-pattern>*.do</url-pattern> 
        注：匹配所有以.do結尾的請求。


Step3.如果找不到匹配的Servlet的，則容器會查找對應的
    文件。


2.讓一個Servlet的處理多種請求

Step1.使用後綴匹配，比如
    <URL模式> *做</ URL模式>
Step2.分析請求資源路徑，依據請求的不同，
    進行相應的處理。


3.Servlet的生命週期
（1）什麼是的Servlet的生命週期？

Servlet的容器​​如何創建的Servlet實例，如何對其進行初始化，
如何調用其方法來處理請求，以及如何其實例的整個過程。
即Servlet的容器​​如何管理的Servlet。

（2）小服務程序生命週期分成哪幾個階段？


1）實例化
a.什麼是實例化？
    容器調用Servlet的的構造器，創建Servlet的對象。
b.什麼時候實例化？
    情形1：容器收到請求之後創建。
    情形2：容器啟動之後，立即創建（需要相應的配置）。
    注：
        容器只會創建一個實例！


2）初始化
a.什麼是初始化？
    容器調用Servlet的對象的初始化方法。
b.init方法。
    b1.GenericServlet已經提供了初始化方法的實現。
        （了解）
        將容器傳遞過來的的ServletConfig對象保存下來，
	並且提供了getServletConfig方法，
	用來獲得的ServletConfig對象。
    b2.init方法只會執行一次。
    b3。可以覆蓋init（）方法來擴展自已的初始化處理邏輯。
    b4。初始化參數


3）就緒（調用）
a.什麼是就緒？
    容器調用Servlet的對象的服務方法處理請求。
b.service方法
        HttpServlet中已經提供了服務方法的實現：

    	依據請求類型調用對應的方法來處理，

  比如get請求調用的doGet方法，Post請求調用的doPost方法。
  可以override doGet和doPost方法或者也可以override service方法。


4）銷毀
a.什麼是銷毀？
    容器在刪除的Servlet對象之前，會調用該對象的
    破壞方法。
b.該方法只會執行一次。

（3）生命週期相關的幾個接口與類（了解）

1）Servlet接口
    init(ServletConfig config)
    service()
    destroy()
2）GenericServlet類抽象類
    實現了Servlet的接口（實現了init,destroy方法）
3）HttpServlet抽象類
    繼承了GenericServlet類（實現了服務方法）