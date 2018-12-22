package Day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io/BufferedReader
 * �w�Ħr�ſ�J�y
 * �i�H����Ū���r�Ŧ�
 * @author Otto
 *
 */
public class BR_readLine {
	public static void main(String[] args) throws IOException {
		/*
		 * ��e���������Ū���X�Өÿ�X�챱��x
		 */
		FileInputStream fis = new FileInputStream(
		//���y
				//"./src/main/java/Day06/BR_readLine.java"
				"src"+File.separator+
				"main"+File.separator+
				"java"+File.separator+
				"Day06"+File.separator+
				"BR_readLine.java"
				);
		InputStreamReader isr = new InputStreamReader(fis);
		//�C�Ŭy
		BufferedReader br = new BufferedReader(isr);
		//��Ƭy
		/*
		 * BufferedReader���ѤF�@�Ӥ�k:
		 * String readLine()
		 * �Ӥ�k�|�s��Ū���Y�z�r��,����Ū������Ŭ���,�M��N����Ť��e���r��
		 * �H�r�Ŧ�Φ���^.�ݭn�`�N,�Ӧr�Ŧꤤ���t���̫᪺�����.
		 * �Y��^�Ȭ�null,��ܩҦ��ƾڳ��wŪ������(Ū���h����󥽧�)
		 */
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
