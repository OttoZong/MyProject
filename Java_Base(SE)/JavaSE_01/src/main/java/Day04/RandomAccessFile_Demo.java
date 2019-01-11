package Day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Ū�����إؿ��U��emp.dat��� �N10�ӭ��u���H��Ū���X�Өÿ�X�챱��x �榡�p�U: �i�p��,22,�k,3500,2008-08-06
 * 
 * �Ӥ��@800�r�`,�C�ӭ��u�e��80�r�`. ���u��5�ӫH��,�r�Ŧ������s�X��:UTF-8.
 * ���O�O:name,age,gemder,salary,hiredate �e�Ϊ����׻P�����Ѭ�emp.jpg�Ϥ�
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_Demo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("emp.dat", "r");

		for (int i = 0; i < raf.length() / 80; i++) {
			// Ū���Τ�W �N�X����
			String name = readString(raf, 32);
			System.out.println(name);

//		byte[] data = new byte[32];
//		raf.read(data);
//		String name = new String(data,"UTF-8").trim();
//		System.out.println(name);

			// Ū���~�� �N�X����
			int age = raf.readInt();
			System.out.println(age);
//		int age = raf.readInt();
//		System.out.println(age);

			// Ū���ʧO �N�X����
			String gender = readString(raf, 10);
			System.out.println(gender);
//		byte[] data1 = new byte[10];
//		raf.read(data1);
//		String gender = new String(data1,"UTF-8").trim();
//		System.out.println(gender);

			// Ū���u�� �N�X����
			int salary = raf.readInt();
			System.out.println(salary);

			// Ū���J¾�ɶ�
			String hiredate = readString(raf, 30);
			System.out.println(name + "," + age + "," + gender + "," + salary + "," + hiredate);
		}
	}

	public static String readString(RandomAccessFile raf, int len) throws IOException {
		byte[] data = new byte[len];
		raf.read(data);
		String str = new String(data, "UTF-8").trim();
		return str;
	}
}
