package Day04;

import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF�M���]�p�Ψ�Ū�g���ƾ�.
 * RAF�O�����w����ƾڶi��Ū�g��,
 * �Y:�`�O�b���w���V��mŪ�μg�r�`.
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_write {
	public static void main(String[] args) throws Exception{
		/*
		 * RAF���`�κc�y��k:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * �Ĥ@�ӰѼƫ��w�nŪ�g�����
		 * �ĤG�ӰѼƬ��Ҧ�:
		 * "r":�uŪ�Ҧ�
		 * "rw":�u�g�Ҧ�
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		
		/*
		 * void write(int d)
		 * �g�X�@�Ӧr�`
		 * �N���w��int�ȩҹ�����2�i��
		 * ��"�C8��"�g�X
		 * 
		 * byte
		 */
		raf.write(1);
		System.out.println("�g�X����!");
		
		raf.close();
	}
}
