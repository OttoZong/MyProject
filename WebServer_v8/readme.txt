在com.tedu.core中添加一個類HttpContext,
該類用於定義相關Http協議的內容.
比如頭信息中Content-Type的值與文件後餟的關係等.

context 上下文

在HttpResponse中進行代碼重構:
添加一個Map屬性,用於保存響應在中的所有響應頭信息.
添加常用頭的設置方法,供外界設置響應頭:

setContentType(),setContentLength(),

重新實現sendHeaders方法.