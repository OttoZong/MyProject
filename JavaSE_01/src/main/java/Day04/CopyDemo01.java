package Day04;

/*
 * �ϥ�RAF�������ƻs
 */
import java.io.RandomAccessFile;

public class CopyDemo01 {
	public static void main(String[] args) throws Exception{
		/**
		 * ��{���ƻs�����:
		 * �ϥ�RAF�q����󤤶���Ū���C�Ӧr�`
		 * �üg�J��t�@�Ӥ��
		 */
		RandomAccessFile src = new RandomAccessFile("music.mp3","r");
		
		RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");
		
		int d = -1; //�Ω�O�sŪ���쪺�C�Ӧr�`
		long start = System.currentTimeMillis();
		while((d = src.read())!=-1) {
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("�ƻs����!�Ӯ�:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}
