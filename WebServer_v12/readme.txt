添加登錄功能
在webapps/myweb下添加一個登錄頁面login.html
在ClientHandler中添加用於處理登錄功能的業務邏輯

登錄流程:
1.瀏覽器訪問登錄頁面.
  http://localhost:8080/myweb/login.html.
2.在頁面中登入信息(用戶名,密碼).
  然後點及登錄按鈕,將表單內容提交到服務端.
3.ClientHandler根據request中的內容判斷是否為請求登錄業務,若是,則開始處理登錄.
  通過request獲取用戶輸入的用戶名和密碼,然後讀取user.txt文件中的每個用戶,
  比對用戶輸入的用戶名密碼是否一致,若都一致則跳轉到登錄成功的頁面.否則跳轉到登錄失敗的頁面.
