package tw;

import javax.swing.JOptionPane;

/**
 * 
 * @author Otto
 *
 */
public class MyException extends Exception{
	
		String message;
		String title;
		public MyException(String message,String title) {
			this.message=message;
			this.title=title;
	}	
		public void setMessage() {
			JOptionPane.showMessageDialog(null, message, title, 2);
		}
}
