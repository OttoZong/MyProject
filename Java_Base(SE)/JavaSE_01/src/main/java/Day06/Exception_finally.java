package Day06;
/**
 * finally��
 * finally�u��w�q�b���`�������̫�i�H����
 * ��btry������γ̫�@��catch����.
 * 
 * finally�i�H�O�Ҹ̭����N�X�@�w����.
 * �ҥH�q�`�|�N�L���G���`�Ӥ��ݹB�檺�N�X,
 * �w�q�bfinally�T�O���̥i�H�Q�B��.��p�y�ާ@��,
 * �����y�N�����bfinally��.
 * 
 * @author Otto
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		try {
			String str = "";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("�X���F");
		} finally {
			System.out.println("finally�����N�X����F!");
		}
		System.out.println("�{�ǵ����F!");
	}
}
