package Day03;

import java.io.File;
import java.io.IOException;

/*
 * �ϥ�file�إߤ@�ӷs���
 */
public class File_createNewFile {
	public static void main(String[] args) throws IOException {
		File file = new File("."+File.separator+"Test.txt");
		/*
		 * boolean exists()
		 * �P�_��efile��ܤ��Υؿ��O�_�u��s�b
		 */
		if(!file.exists()) {
//			�N���ХߥX��
			file.createNewFile();
			System.out.println("���Ыا���!");
		}else {
			System.out.println("�Ӥ��w�g�s�b!");
		}
	}
}
