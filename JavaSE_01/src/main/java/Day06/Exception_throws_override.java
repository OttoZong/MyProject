package Day06;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �l���b���g�����@�ӧt��throws�n�����`
 * �ߥX����k�ɹ�throws�����g�W�h.
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
	
	//�ȩߥX�������`
//	public void dosome()
//			throws IOException{
//		
//	}
	
	//���A�ߥX���󲧱`
//	public void dosome()
//			throws IOException{
//		
//	}
	
	/**
	 * �i�H�ߥX������k�ߥX�����`���l�������`
	 */
//	public void dosome()
//			throws FileNotFoundException{
//		
//	}
	
	//�����\�ߥX�B�~���`
//	public void dosome()
//			throws SQLException{
//		
//	}
	
	/**
	 * �����\�ߥX������k�ߥX���`�����������`
	 */
//	public void dosome()
//			throws Exception{
//		
//	}
}