package Day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io/BufferedReader
 * 絯侥才块瑈
 * ︽弄才﹃
 * @author Otto
 *
 */
public class BR_readLine {
	public static void main(String[] args) throws IOException {
		/*
		 * 讽玡摸方ゅン弄ㄓ块北
		 */
		FileInputStream fis = new FileInputStream(
		//ゅン瑈
				//"./src/main/java/Day06/BR_readLine.java"
				"src"+File.separator+
				"main"+File.separator+
				"java"+File.separator+
				"Day06"+File.separator+
				"BR_readLine.java"
				);
		InputStreamReader isr = new InputStreamReader(fis);
		//瑈
		BufferedReader br = new BufferedReader(isr);
		//锣て瑈
		/*
		 * BufferedReader矗ㄑよ猭:
		 * String readLine()
		 * 赣よ猭穦硈尿弄璝才,弄传︽才ゎ,礛盢传︽才ぇ玡才
		 * 才﹃Α.惠璶猔種,赣才﹃いぃΤ程传︽才.
		 * 璝null,ボ┮Τ计沮常弄Ч拨(弄ゅン玥ゅンソЮ)
		 */
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
