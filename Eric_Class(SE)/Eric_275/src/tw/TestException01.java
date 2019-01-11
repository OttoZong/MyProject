package tw;

import java.util.Scanner;


/**
 * 
 * @author Otto
 *
 */
public class TestException01{
	public static void main(String[] args) {
		getNum(10,0);
//		Scanner s = new Scanner(System.in);
//		int i = s.nextInt();
//		System.out.println(i);
	}
	public static void getNum(int a,int b) {
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			new MyException("除以零是不行的","idiot").setMessage();
		}
	}
}
