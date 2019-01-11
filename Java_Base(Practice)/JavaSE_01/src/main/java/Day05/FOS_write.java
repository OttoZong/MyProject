package Day05;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/**
 * java�з�IO input output
 * Java�N�y��������:
 * ��J�y:��J�y�Ψ�Ū���ƾ�
 * ��X�y:�ΨӱN�ƾڼg�X
 * 
 * java�N�y��������:
 * �`�I�y:�`�I�y�S�٬��C�Ŭy,�O�إߦb�{��
 * 		   �P�ƾڷ�������"�޹D",�t�d��ڷh�B�ƾڪ��y
 * 		   Ū�g�@�w�O�إߦb�`�I�y��¦�W��.
 * �B�z�y:�B�z�y�S�٬����Ŭy,�S�I�O����W�ߦs�b(�S���N�q),
 * 		   �����B�z��L�y,�B�z���ت��O�q�L���i�H²�Ƨڭ�Ū�g
 * 		   �ާ@.
 * 
 * java.io.InputStream
 * java.io.OutputStream
 * �H�W��Ӭy�O�Ҧ��r�`�y������,�w�q�F��J�P��X�y�������
 * ����Ū�g��k,���L�̥����O��H��,�ҥH���ઽ���ϥ�
 * 
 * ���y
 * ���y�O�Ψ�Ū�g��󪺬y.
 * java.io.FileInputStream
 * ����J�y,�Ψ�Ū�����ƾڪ��y
 * 
 * java.io.FileOutputStream
 * ����X�y,�ΨӦV��󤤼g�X�ƾڪ��y
 * 
 * @author Otto
 *
 */
public class FOS_write {
	public static void main(String[] args) throws Exception {
		/*
		 * FileOutputStream�PRandomAccessFile
		 * ��̦��ܤj����W���ϧO.�\��@��,�ϥήɾ����P.
		 * 
		 * RandomAccessFile,Random�i�H�Ƽg.
		 * FileOutputStream,�y�O�@����,���i�s����.
		 * 
		 * 
		 * FileOutputStream���`�κc�y��k:
		 * 
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * ���}�@�ӹﵹ�w���i��g�ާ@������X�y
		 * �o�سЫؤ�k��:�л\�g�ާ@.
		 * �Y:�Y���w�����s�b,�h�|���N�Ӥ��Ҧ����e
		 * �M��.�M��N�q�L��e�y�g�X���ƾڼg�J�Ӥ��.
		 * 
		 * FileOutputStream(String path,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * ��եΤW�z��Ӻc�y��k��,�Y�ĤG�ӰѼƶǤJ����true,
		 * �h��e����X�y���l�[�g�Ҧ�.
		 * �Y:���즳�ƾڳ��O�d,�q�L�Ӭy�g�X���ƾڷ|�Q�l�[���󥽧�.
		 * 
		 * �y�u��l�[,���㦳�s���󪺯�O.
		 * 
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
//		RandomAccessFile fos = new RandomAccessFile("fos.txt","rw");
		
		
		String str = "�o���b�M�ֽͽ׬۳{���t�q.";
		fos.write(str.getBytes("UTF-8"));
		System.out.println("�g�X����!");
		fos.close();
		
	}
}
