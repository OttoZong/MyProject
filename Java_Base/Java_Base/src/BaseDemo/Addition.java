package BaseDemo;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0; //�o��
		for(int i=0;i<10;i++) {	//10��
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a + b; //�D�M
			System.out.println("("+i+")"+a+"+"+b);
			
			System.out.println("��a!");
			int answer = scan.nextInt(); //2.
			
			if(answer==-1) {
				break;
			}
			
			if(answer == result) {
				score += 10; //����@�D�[�Q��
				System.out.println("����F");
			}else {
				System.out.println("�����F");
			}
		}
		System.out.println("�`����:"+score);
	}

}
