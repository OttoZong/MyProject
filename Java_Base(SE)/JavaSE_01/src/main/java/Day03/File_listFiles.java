package Day03;

import java.io.File;

public class File_listFiles {
	public static void main(String[] args) {
		/*
		 * �d�ݷ�e�ؿ������Ҧ����e
		 */
		File dir = new File(".\\a");
		
		/*
		 * boolean isFile()
		 * �P�_��eFile��ܪ��O�_�����
		 * 
		 * boolean isDirectory()
		 * �P�_��eFile��ܪ��O�_���ؿ�
		 */
		//�P�_�O�_���ؿ�
		if(dir.isDirectory()) {
			//����Ҧ��l��
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++) {
				System.out.println(subs[i].getName());
			}
		}
	}
}
