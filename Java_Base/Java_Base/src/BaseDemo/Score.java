package BaseDemo;

import java.util.Scanner;

public class Score {
//	���Z�P�_
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���Z");
		int score = scan.nextInt();

		if (score >= 0 && score <= 100) { // �X�k

			if (score >= 90) {
				System.out.println("A-�u�q");
			} else if (score >= 80) {
				System.out.println("B-�}�n");
			} else if (score >= 60) {
				System.out.println("C-����");
			} else {
				System.out.println("D-���ή�");
			}
		} else { // ���X�k
			System.out.println("�ƾڤ��ŦX�d��");
		}

	}

}
