package Day03;

import java.io.File;

public class File_delete {
	public static void main(String[] args) {
		/*
		 * ��e�ؿ�����test.txt���R��
		 * 
		 * ./�O�i�H���g,���g�N�q�{�N�b��e�ؿ�
		 */
		File file = new File("Test.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("�R������!");
		}else {
			System.out.println("����󤣦s�b!");
		}
		
	}
}
