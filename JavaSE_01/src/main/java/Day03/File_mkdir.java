package Day03;

import java.io.File;

/*
 * �ϥ�file�إߤ@�ӥؿ�
 */
public class File_mkdir {
	public static void main(String[] args) {
		/*
		 * �b��e�ؿ��U�إߤ@�ӥؿ�:demo
		 */
		File dir = new File("demo");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("�ؿ��w�إ�!");
		}else {
			System.out.println("�ӥؿ��w�s�b!");
		}
	}

}
