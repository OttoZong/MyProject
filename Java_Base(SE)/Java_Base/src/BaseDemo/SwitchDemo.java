package BaseDemo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�R�O:1.��ܩҦ����� 2.�d�ߵn�J���� 0.�h�X");
			int command = scan.nextInt();
			
			switch(command) {
			case 1:
				System.out.println("��ܥ����O��");
				break;
			case 2:
				System.out.println("�d�ߵn�J����");
				break;
			case 0:
				System.out.println("�{�b�w�h�X");
				break;
			default:
				System.out.println("��J���~�A�Э��s��J");
		}
	}

//	int num = 2;
//	switch(num) {
//	case 1:
//		System.out.println(111);
//	case 2:
//		System.out.println(222);
//	case 3:
//		System.out.println(333);
//	case 4:
//		System.out.println(666);


}
