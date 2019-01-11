package Day04;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
/**
 * �����Τ���U�\��
 * �{�ǱҰʫ�,�n�D�ӥΤ��J���U�T��
 * �榡�p:
 * �B�ɪQ,55,�k,5000,2008-08-04
 * �M��N�ӥΤ�T���g�J��emp.dat��󪺳̫�
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_Register {
	public static void main(String[] args) throws Exception {
		/*
		 * ��{���:
		 * 
		 * 1:���q�LScanner����Τ��J���@��Τ�H��,�p:
		 * 	�B�ɪQ,55,�k,5000,2008-08-04
		 * 2:����","����Ӧr�Ŧ�,�o��W�l���������C�@���H��
		 * 3:�Ы�RandomAccessFile��emp.dat���ާ@
		 * 4:���ʫ��w���󪺥���(raf.lengtj())
		 * 5:���N�W�r�ഫ���r�`,�M���X�e��32�Ӧr�`�üg�J���
		 * 	�M��N�g�Jint��,�ӭȬO�~��
		 * 	���ǱN����X���g�J.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���U�H��:");
		String line = scan.nextLine();
//		System.out.println(line);
		
		//�N��J��ƫ���","���
		String[] data = line.split(",");
		System.out.println("len:"+data.length);
		System.out.println(Arrays.toString(data));
		
		RandomAccessFile raf = new RandomAccessFile("emp.dat","rw");
		
		raf.seek(raf.length());
		//�g�Τ�W
		writeString(raf,data[0],32);
//		byte[] nameArr = data[0].getBytes("UTF-8");
//		nameArr = Arrays.copyOf(nameArr, 32);
//		raf.write(nameArr);
	//	raf.write(data[0].getBytes("UTF-8"));
		
		//�g�~��
		raf.writeInt(Integer.parseInt(data[1]));
		
		//�g�ʧO
		writeString(raf, data[2], 10);
//		byte[] genderArr = data[2].getBytes("UTF-8");
//		genderArr = Arrays.copyOf(genderArr, 10);
//		raf.write(genderArr);
		
		//�g�u��
		raf.write(Integer.parseInt(data[3]));
		
		//�g�J�J¾�ɶ�
		writeString(raf, data[4], 30);
		
		System.out.println("���U����!");
		raf.close();
	}
	public static void writeString(RandomAccessFile raf,String str,int len) throws IOException {
		byte[] genderArr = str.getBytes("UTF-8");
		genderArr = Arrays.copyOf(genderArr, len);
		raf.write(genderArr);
	}
}
