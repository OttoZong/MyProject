package Day06;
/**
 * ���`���ߥX
 */
import Day02.Person;

public class Exception_throw {
	public static void main(String[] args) {
		System.out.println("�{�Ƕ}�l�F");
			try {
				Person p = new Person();
				/*
				 * ��եΤ@�ӧt��throws�n�����`�ߥX����k��,
				 * �sĶ���n�D�����B�z�o�ǲ��`.
				 * �B�z�覡�����
				 * 1:�ϥ�try-catch���򲧱`�óB�z
				 * 2:�~��b��e��k�W�ϥ�throws,
				 * 	  �N�Ӳ��`�n���ߥX.
				 */
				p.setAge(20);
				System.out.println(p.getAge());
			} catch (Exception e) {		//catch (IllegalAgeException e)
				e.printStackTrace();
			}
			
		System.out.println("�{�ǵ����F");
	}
}
