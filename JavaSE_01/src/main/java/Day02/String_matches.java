package Day02;

import java.util.Scanner;

/**
 * �r�Ŧ������h��F����������k:
 * boolean matches(String regex)
 * �ϥε��w�����h��F�����ҷ�e�r�Ŧ�O�_����
 * �Ӯ榡�n�D.
 * 
 * �`�N,�`�N,�`�N!
 * ���h��F���L�׬O�_�K�[�F��ɤǰt�Ÿ�(^$),
 * ���O�����ǰt����!
 * @author Otto
 *
 */
public class String_matches {
	public static void main(String[] args) {
		/*
		 * �H�c�����Ū�F��:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
//		System.out.println(regex);
		
//		String mail = "fancq@tedu.cn";
		System.out.println("�п�J�H�c�G");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean match = str.matches(regex);
		
		if(match) {
			System.out.println("�O�l�c");
		}else {
			System.out.println("���O�l�c");
		}
		
	}
}
