package Day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * ��H�y
 * ��H�y�O�@�ﰪ�Ŭy,�i�HŪ�gjava�������H
 * 
 * java.io.ObjectOutputStream
 * ��H��X�y,�i�H�N���w����H�ഫ���@�զr�`��g�X
 * 
 * java.io.ObjectInputStream
 * ��H��J�y,�i�HŪ���@�զr�`�ç촫���������H,
 * �e���O�Ӳզr�`������H��X�y�g�X���@�ӹ�H���ഫ���r�`.
 * 
 * oos �t�d��H�ǦC��,fos �t�d�ƾګ��[��.
 * oos �N���w��H��Ƭ��@�զr�`,fos �N�r�`�g�J����.
 *
 * @author Otto
 *
 */
public class OOS_writeObject {
	public static void main(String[] args) throws IOException {
		Object_Person person = new Object_Person();
		person.setName("�a�Ѯv");
		person.setAge(18);
		person.setGender("�k");
		person.setOtherInfo(new String[] {
				"�O�@�W�t��","�R�n�g�j�r","�P�i�����ƥ�y","�s�j�k�ʦP�M�һX�Ѯv"
		});

		
		System.out.println(person);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ��H��X�y���Ѽg�X��H��k:
		 * writeObject(Object obj)
		 * �Ӥ�k�|�N���w��H���Ө䵲�c�ഫ��
		 * �@�զr���,�A�q�L��B�z���y�N���g�X.
		 * 
		 * �ݭn�`�N,���w����H������������{
		 * �i�ǦC�Ʊ��f,�_�h�|�ߥX���`.
		 * 
		 * �o�̱N��H�g�J���g����ӨB�J:
		 * 1:�q�L��H��X�y�Nperson���ഫ
		 * 	 ���@�զr�`,�o�ӹL�{�٬�:
		 * 	 ��H�ǦC��.
		 * 2:�N�ǦC�ƫ᪺�r�`�A�q�Lfos�g�J
		 * 	  ����(in disk)�����[�O�s��
		 * 	 �L�{�٬�:�ƾګ��[��.
		 * 
		 */
		oos.writeObject(person);
		
		System.out.println("�g�X����!");
		oos.close();
	}

}
