package Day1;

import java.util.Scanner;

public class Score02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("��J���Z���b�d���");
		}else if (score >= 90) {
			System.out.println("A-�u�q");
		}else if (score >= 80) {
			System.out.println("B-�u�}");
		}else if (score >= 60) {
			System.out.println("C-����");
		}else {
			System.out.println("D-���ή�111");
		}

	}

}
