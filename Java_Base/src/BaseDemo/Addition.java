package BaseDemo;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0; //得分
		for(int i=0;i<10;i++) {	//10次
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a + b; //求和
			System.out.println("("+i+")"+a+"+"+b);
			
			System.out.println("算吧!");
			int answer = scan.nextInt(); //2.
			
			if(answer==-1) {
				break;
			}
			
			if(answer == result) {
				score += 10; //答對一題加十分
				System.out.println("答對了");
			}else {
				System.out.println("答錯了");
			}
		}
		System.out.println("總分為:"+score);
	}

}
