package BaseDemo;
import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���");
		double unitPrice = scan.nextDouble();
		System.out.println("�п�J�ƶq");
		double amount = scan.nextDouble();
		System.out.print("�п�J���B");
		double money = scan.nextDouble();
		
		//�p���`��(���*�ƶq)
		double totalPrice = unitPrice * amount;
		if(totalPrice>=500) { //��500
			totalPrice *= 0.8;  //���K��
		}
		if(money>=totalPrice) { //����
			//�p���s(������-�`��)
			double change = money- totalPrice;
			System.out.println("�`����"+totalPrice+"�A��s��:"+change);
		}else {
			System.out.println("Error�A�t�B��:"+(totalPrice-money));
		}
		
		
		
		
		
	}

}
