package Day03;
/**
 * 1:�s�g�@�q�{�ǡA����1+2+3+4...100,
 * �ÿ�X���G.
 * ��q�N�X�����o�X�{for,while����r
 * 
 * 2.�R�T��,1����1�~,2�ӪŲ~�i�H���@�~�T��,
 * 	3�Ӳ~�\�i�H���@�~�T��,�s�g�{�ǭp��20����
 * 	�`�@�R��h�ֲ~�T��.
 */
import java.io.File;

public class File_deleteDemo {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	/*
	 * �N���w��File��ܪ����Υؿ��R��
	 * @param file
	 */
	public static void delete(File file) {
		if(file.isDirectory()) {
			//�N�ӥؿ��l�������M��
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++) {
				//���k�ե�
				delete(subs[i]);
			}
		}
		file.delete();
	}

}
