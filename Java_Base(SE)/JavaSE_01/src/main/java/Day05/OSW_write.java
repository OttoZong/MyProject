package Day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java���ӬyŪ�g�ƾڪ���칺����:
 * �r�`�y,�r�Ŭy
 * �r�Ŭy��Ū�g���O�r��,���O��ک��h�٬O�H
 * �r�`�����Ū�g.�r�Ŭy�|�t�d�N�r�ŻP�r�`
 * �����i���ഫ.
 * �ѩ�r�Ŭy�H�r�Ŭ����Ū�g,�ҥH���̥u�A�X
 * Ū�g�奻�ƾ�!
 * 
 * Reader,Writer�O�Ҧ��r�ſ�J,��X�y���W��
 * �W�w�F�r�Ŭy�������ƪ�Ū�g�r�Ť�k.
 * 
 * �ഫ�y
 * InputStreamReader,OutputStreamWriter
 * �L�̤��ҥH�s�ഫ�y,�O�]��java����L���r�Ŭy
 * ���u�౵�b��L�r�Ŭy�W,���ઽ���B�z�r�`�y,
 * ���ഫ�y�O�i�H�B�z�r�`�y��,�L�̥����S�O�r�Ŭy,
 * �i�H�Q��L�r�Ŭy�B�z.�ҥH���̰_��F"�ഫ��"
 * ���@��,�q�ӹ�{�F��L�r�Ŭy�̲ץi�H�s����۸`�y
 * �W���ت�.
 * 
 * @author Otto
 *
 */
public class OSW_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("�n�[�S���F,���򨤦�O.");
		osw.write("�Ӥ߸˧��,�զ�Ũ�m,�S�f�O�A�e��.");
		System.out.println("�g�X����!");
		
		osw.close();
	}
}
