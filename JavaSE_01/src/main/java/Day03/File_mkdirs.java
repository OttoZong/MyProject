package Day03;

import java.io.File;

public class File_mkdirs {
	public static void main(String[] args) {
		/*
		 * �b��e�ؿ��U�Ыإؿ�:
		 * a/b/c/d/e/f
		 */
		File dir = new File(
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"e"+File.separator+"f"		
		);
		if(!dir.exists()) {
			/*
			 * mkdirs�b�Х߷�eFile��ܪ��ؿ���
			 * �|�N�Ҧ����s�b�����ؿ��@�P�ЫإX��.
			 * ��mkdir���㦳�o�ˤl���\��.
			 */
			dir.mkdirs();
			System.out.println("�ؿ��w�Х�!");
		}else {
			System.out.println("�ؿ��w�s�b!");
		}
	}
}
