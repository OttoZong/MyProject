代碼重構
將ClientHandler的功能進行拆分,明確每個類的功能.

ClientHandler用於處理客戶端請求,然後響應客戶端,
但是不負責處理具體業務處理.相當於是一個分發請求的控制腳色.

將具體的業務(如註冊,登錄)功能單獨定義為一個功能類,
由ClientHandler統一調用.


負責處理註冊業務的類:RegServlet.
負責處理登錄業務的類:LoginServlet.