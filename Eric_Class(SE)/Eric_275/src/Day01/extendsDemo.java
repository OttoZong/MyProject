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
		JOptionPane.showMessageDialog(null,"�e���g���{���A�i�H��"+message);
	}
	public void getExmethod() {
		message="�e���g���{���A�i�H��";
	}
	
	public abstract void getAbs();
}
