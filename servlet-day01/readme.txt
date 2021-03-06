﻿撰寫Servlet

Step1，寫一個java類，實現的Servlet接口或者繼承HttpServlet的抽象類。
Step2，編譯。
Step3，打包。
    創建一個具有如下結構的文件夾：
    應用程序名稱（應用名，可以自定義）
        WEB-INF
             課程（.class文件）
             lib（可選放第三方的jar文件）
             web.xml（部署描述文件）

Step4，部署。
    將第三步創建好的文件夾拷貝到容器指定的位置。
    注：
        可以將第3步創建好的文件夾使用的jar命令壓縮成的.war為後綴的文件，然後拷貝。

Step5，啟動容器，訪問的Servlet
    HTTP：// IP：端口/應用程序的名字/ url-pattern的
    注：
        IP和端口指的是容器所在的機器的IP地址
        和端口號。
        url-pattern的在web.xml中指定。

比如在瀏覽器地址，輸入http：// localhost：8080 / servlet-day01 / hello。

Step1，瀏覽器依據IP和端口建立與服務器之間連接。
Step2，瀏覽器將相關數據打包成請求數據包，然後發送給服務器。
Step3，服務器解析請求數據包，並且將解析到的數據存放到請求對象裡面，
	同時，創建一個響應對象。

Step4，服務器創建Servlet的對象，然後調用該對象的
    服務方法來處理請求。
    注：
        在調用服務方法時，會將請求對象和響應對象作為參數傳過來。
	所以，可以在服務方法裡面，調用請求對象
        來獲取請求數據包中的數據，並且將處理結果寫到響應對象裡面。

Step5，服務器通過響應對象獲取處理結果，並且打包成響應數據包，然後發送給瀏覽器。

Step6，瀏覽器解析響應數據包中的數據，然後展現。


4.常見的問題及解決方式
（1）404
1）404是一個狀態碼，表示服務器依據請求路徑找不到對應的資源。
狀態碼：是一個三位數字，由http協議規定，表示服務器處理請求的一種狀態。

2）解決方式
    一，檢查請求路徑是否正確
   http://ip:port/appname/url-pattern
    檢查是否正確部署了該應用

（2）500
1）500也是一個狀態碼，表示服務器處理出錯。
2）解決方式
    a.代碼錯誤。
    比如沒有繼承的HttpServlet。
    b.代碼不嚴謹。
    比如將一個字符串轉換成數字，沒有做相應的檢查。
    c.配置出錯。

（3）405
1）405也是一個狀態碼，表示服務器找不到處理方法。
2）解決方式
    檢查服務方法
    （包括方法名，返回類型，參數類型，異常類型）