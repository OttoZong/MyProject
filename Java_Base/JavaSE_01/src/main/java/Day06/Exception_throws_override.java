package Day06;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 子類在重寫父類一個含有throws聲明異常
 * 拋出的方法時對throws的重寫規則.
 * @author Otto
 *
 */

public class Exception_throws_override {
		public void dosome()
				throws IOException,AWTException{
			
		}
}
class Son extends Exception_throws_override{
//	public void dosome()
//			throws IOException,AWTException{
//		
//	}
	
	//僅拋出部分異常
//	public void dosome()
//			throws IOException{
//		
//	}
	
	//不再拋出任何異常
//	public void dosome()
//			throws IOException{
//		
//	}
	
	/**
	 * 可以拋出父類方法拋出的異常的子類型異常
	 */
//	public void dosome()
//			throws FileNotFoundException{
//		
//	}
	
	//不允許拋出額外異常
//	public void dosome()
//			throws SQLException{
//		
//	}
	
	/**
	 * 不允許拋出父類方法拋出異常的父類型異常
	 */
//	public void dosome()
//			throws Exception{
//		
//	}
}