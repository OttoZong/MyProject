package Day04;

import java.io.RandomAccessFile;

/**
 * RAFŪ�g�������ƾڥH�ΰw����w���ާ@
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_writeInt {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("type.dat", "rw");
		raf.seek(0);
		System.out.println("pos:" + raf.getFilePointer());
		//�s��Ū��4�Ӧr�`���٭쬰int�Ȫ�^
		int d = raf.readInt();
		System.out.println(d);
		
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * �N���w��int�ȼg�J��� �s��g�X4�Ӧr�`
		 */
		
		//Ūlong��,�@��Ū�K�Ӧr�`
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * ��ե�readInt��k�b���Ū����
		 * �o�{�F���󥽧���,�|�ߥX:
		 * EOFExceoption EOF end of file
		 */
		d = raf.readInt();
		
		raf.close();
	}
}
