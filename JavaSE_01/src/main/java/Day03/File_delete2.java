package Day03;

import java.io.File;

public class File_delete2 {
	public static void main(String[] args) {
		/*
		 * �R����e�ؿ��U�W��demo���ؿ�
		 */
		File dir = new File("a");
		if(dir.exists()) {
			/*
			 * delete��k�R���ؿ��n�D�ӥؿ�
			 * �����O�@�Ӫťؿ�
			 */
			dir.delete();
			System.out.println("�ӥؿ��w�R��");
		}else {
			System.out.println("�ӥؿ����s�b!");
		}
	}

}
