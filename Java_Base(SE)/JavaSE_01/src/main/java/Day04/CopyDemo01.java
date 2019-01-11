package Day04;

/*
 * 使用RAF完成文件複製
 */
import java.io.RandomAccessFile;

public class CopyDemo01 {
	public static void main(String[] args) throws Exception{
		/**
		 * 實現文件複製的思路:
		 * 使用RAF從源文件中順序讀取每個字節
		 * 並寫入到另一個文件中
		 */
		RandomAccessFile src = new RandomAccessFile("music.mp3","r");
		
		RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");
		
		int d = -1; //用於保存讀取到的每個字節
		long start = System.currentTimeMillis();
		while((d = src.read())!=-1) {
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("複製完畢!耗時:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}
