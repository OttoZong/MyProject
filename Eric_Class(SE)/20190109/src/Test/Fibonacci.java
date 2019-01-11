package Test;

import java.util.Scanner;

/* 假設題目要求：給一數字N，求費氏數列中第N數的值
 * 構想：N = 1 or 2時，直接輸入Ans = 1; 
 * 若N >=3，則進入迴圈判斷計算(N=3 to N)，利用兩個變數儲存 N-1 與 N-2 的值，程式碼如下：
 * 
 * 根據輸入的數值n 傳回fibonacci結果
 * Fibonacci數列說明:f(1)=1,f(2)=1,f(n)=f(n-1)+(n-2)
 * 
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		
		if(number == 1) {
			System.out.println("last Fibonacci num = 1");
		} else if(number == 2) {
			System.out.println("last Fibonacci num = 1");
		} else {
			int res = calculate(number);
			System.out.println("last Fibonacci num = "+res);
		}
	}

	private static int calculate(int num) {
		
		int p1 = 1; //the first number in fibonacci
		int p2 = 1; //the second number in fibonacci
		int res = 0;
		for(int i = 3; i <= num; i++) {
			res = p1 + p2;
			p1 = p2;
			p2 = res;
		}
		
		return res;
	}

}