3.訪問數據庫

Step1，導包。

MySQL的驅動，DBCP連接池。
Step2，添加db.properties文件。
Step3，添加DBUtils類（之前在學JDBC時寫的那個類）
Step4，測試DBUtils（看能否提供連接）。
Step5，建表

create table t_user（
     id int（8）主鍵auto_increment，
     username varchar（30）unique，
     pwd varchar（20），
     手機varchar（20）
）;

Step6，在服務方法中，使用jdbc api訪問數據庫。




1.DAO（數據訪問對象）

（1）DAO是什麼？
用於封裝數據訪問邏輯的對象。
（2）如何寫DAO？
Step1，寫一個類，用於存放從數據庫中查詢出來的記錄。
    注：該類經常稱之為實體類。
Step2，寫一個類，封裝數據訪問邏輯。
    注：負責將記錄轉換成相應的實體對象。


2.重定向
（1）什麼是重定向？
服務器通知瀏覽器向一個新的地址發送請求。
注：
    服務器可以發送一個302狀態碼和一個位置
消息頭（該消息頭的值是一個地址，稱之為重定向地址）給瀏覽器，
瀏覽器收到之後，會立即向重定向地址發送請求。

（2）如何重定向？
response.sendRedirect（String url）。
注：
    網址就是重定向地址。
    重定向之前，服務器會先清空響應對象上存放的數據。

（3）特點
1）重定向地址是任意的。
2）重定向之後，瀏覽器地址欄的地址會發生變化。
3）讀取請求參數值

（1）方式一

String request.getParameter（String paramName）
注：
    a.如果請求參數名寫錯，會獲得零值。
    b.有可能獲得空字符串（比如，表單提交時，
    沒有填寫任何數據）。

（2）方式二

String [] request.getParameterValues（String paramName）
注：
    當有多個請求參數名相同的時候，使用該方法。
    對於多選框和單選框，如果用戶沒有選擇任何選項，
    會返回空值。