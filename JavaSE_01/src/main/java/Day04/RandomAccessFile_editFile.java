package Day04;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * �ϥ�RandomAccessFile�i�H�ھګ��w��m
 * �g�ާ@���л\�즳�ƾ�
 * @author Otto
 *
 */

public class RandomAccessFile_editFile {
	public static void main(String[] args) throws IOException {
		/*
		 * �Nemp.dat��󤤱i�p�᪺�ʧO�אּ�k
		 */
		RandomAccessFile raf = new RandomAccessFile("emp.dat","rw");
		//�N���w���ʨ�i�p��ʧO����m
//		raf.seek(36);
//		//�g�r�Ŧ�"�k"
//		byte[] data ="�k".getBytes("UTF-8");
//		raf.write(data);
//		System.out.println("�ק粒��!");
//		raf.close();
		
		//���ʨ�ĤG�ӤH�W�r���Ĥ@�Ӧr�`
		raf.seek(80);
		byte[] data = "aaa".getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
//		raf.write("a".getBytes("UTF-8"));
		raf.write(data);
		System.out.println("�ק粒��!");
	}
}
