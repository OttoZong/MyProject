package tw2;

import javax.swing.JOptionPane;

/**
 * 
 * @author Otto
 *
 */
public class MyException extends Exception{
	
		private String message;
		private String title;
		private int type;
		public MyException(String message,String title,int type) {
			this.message=message;
			this.title=title;
			this.type=type;
	}	
		public void setMessage() {
			JOptionPane.showMessageDialog(null, message, title, type);
		}
}
