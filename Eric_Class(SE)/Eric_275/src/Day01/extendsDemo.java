package Day01;

import javax.swing.JOptionPane;

/**
 * 
 * @author Otto
 *
 */
public abstract class extendsDemo {
	String message = null;
	public void getMyNe() {
		JOptionPane.showMessageDialog(null,"前輩寫的程式，可以用"+message);
	}
	public void getExmethod() {
		message="前輩寫的程式，可以用";
	}
	
	public abstract void getAbs();
}
