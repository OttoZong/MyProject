package Day04;

import java.io.RandomAccessFile;

/**
 * 若想提高讀寫效率,可以通過提高每次讀寫的
 * 數據量,減少實際讀寫次數來達到.
 * @author Otto
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws Exception  {
		RandomAccessFile src = new RandomAccessFile("movie.mp4","r");
		RandomAccessFile desc = new RandomAccessFile("movie_cp.mp4","rw");
		/*
		 * int read(byte[] data)
		 * 一次性讀取給定字節數組總長度的字節量
		 * 並存入到該數組中,返回的int值表示
		 * 本次實際讀取到的字節量.
		 * 若返回值為-1,表示本次沒有讀取到任何數據(文件末尾)
		 * 
		 * void write(byte[] data)
		 * 一次性將給定的字節數組中的所有字節寫入到文件中
		 * 
		 * void write(byte[] data,int index,int len)
		 * 一次性將給定的字節數組中從index下標
		 * 外對應的字節開始的連續len個字節寫入文件
		 */
		int len = -1; //保存每次實際讀取的字節量
		byte[] data = new byte[1024*10]; //10kb
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1) {
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("複製完畢,耗時:"+(end-start)+"ms");
		
		src.close();
		desc.close();
	}
}
