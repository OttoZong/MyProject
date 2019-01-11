package Day04;

import java.io.RandomAccessFile;

/**
 * �Y�Q����Ū�g�Ĳv,�i�H�q�L�����C��Ū�g��
 * �ƾڶq,��ֹ��Ū�g���ƨӹF��.
 * @author Otto
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws Exception  {
		RandomAccessFile src = new RandomAccessFile("movie.mp4","r");
		RandomAccessFile desc = new RandomAccessFile("movie_cp.mp4","rw");
		/*
		 * int read(byte[] data)
		 * �@����Ū�����w�r�`�Ʋ��`���ת��r�`�q
		 * �æs�J��ӼƲդ�,��^��int�Ȫ��
		 * �������Ū���쪺�r�`�q.
		 * �Y��^�Ȭ�-1,��ܥ����S��Ū�������ƾ�(��󥽧�)
		 * 
		 * void write(byte[] data)
		 * �@���ʱN���w���r�`�Ʋդ����Ҧ��r�`�g�J����
		 * 
		 * void write(byte[] data,int index,int len)
		 * �@���ʱN���w���r�`�Ʋդ��qindex�U��
		 * �~�������r�`�}�l���s��len�Ӧr�`�g�J���
		 */
		int len = -1; //�O�s�C�����Ū�����r�`�q
		byte[] data = new byte[1024*10]; //10kb
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1) {
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("�ƻs����,�Ӯ�:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}
