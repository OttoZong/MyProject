package Day1;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���");
		double unitPrice= scan.nextDouble();
		System.out.println("�п�J�ƶq");
		double amount = scan.nextDouble();
		System.out.println("�п�J���B");
		double money = scan.nextDouble();
		
		double total = unitPrice * amount;
		if(total>=500) {
			total*= 0.8;
		}
		if(money>=total) {
			double change= money-total;
			System.out.println("�`����"+total+"�A��s��:"+change);
		}else {
			System.out.println("Error�A�t�B��:"+(total-money));
		}

	}

}
