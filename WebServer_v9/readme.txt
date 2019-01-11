完成HttpRequest中對消息頭的解析工作.
1.在HttpRequest中使用Map創建一個屬性headers,
    用於保存所有客戶端發過來的消息頭信息
2.添加方法parseHeaders,用於解析所有的消息頭.