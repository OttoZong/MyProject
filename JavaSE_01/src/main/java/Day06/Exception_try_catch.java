package Day06;

public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("�{�Ƕ}�l�F");
		try {
//			String str = null;
//			String str = "";
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			/*
			 * try�����X�����N�X�H�U�����e�����|�A����.
			 */
			System.out.println("!!!!!!!!!!!!!!");
			//NullPointerException �������ū��w
		} catch (NullPointerException e) {
			System.out.println("�X�{�F�ū��w");
			//StringIndexOutOfBoundsException ����r�Ŧ�V��
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�r�Ŧ�U�жV�ɤF!");
			/*
			 * catch�i�H�w�q�h��,�w�藍�P���`�����P�ѨM��q��,
			 * ����w��o�ǲ��`�i�殷��.���O�ݾi���@�Ӧn�ߺD,
			 * �b�̫�Exception,�o�򰵥i�H�קK�]try�N�X�����ߥX
			 * �@�ӥ����򲧱`�ɭP�{�Ǥ��_.
			 * 
			 * ���򪺲��`�s�b�~�����Y��,
			 * ����N�l�������`�w�q�b�W�����殷��.
			 */
			//Exception ����Ҧ������~
		} catch (Exception e) {
			System.out.println("�ϥ��N�O�X�F��!");
		}

		System.out.println("�{�ǵ����F");
	}
}
