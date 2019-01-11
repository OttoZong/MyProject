完成註冊功能

通過該功能,理解客戶端使用Get請求如何傳遞數據到服務端.服務端如何解析這些數據.
Get請求是地址欄請求,即:所有請求的是通過地址欄形式將數據隨著URL連同發送至服務端.

格式:
protocl://host:port/requestStr?queryStr

其中requestStr是請求的uri,而queryStr是傳遞的參數.它們之間使用?作為分割.
而參數的格式定義為:
name1=value1&name2&value2.....

例如:
http://localhost:8080/myweb/reg?name=zs&pwd=123456