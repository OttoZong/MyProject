package Day06;
/**
 * ���ղ��`�ߥX�����ާ@
 * @author Otto
 *
 */
public class Throws_person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException{
		if(age<0 || age>100) {
			/*
			 * throw�Ω�D�ʩߥX�@�Ӳ��`
			 * ���FRuntimeException�Ψ�L�l�������`�~,
			 * �ߥX���򲧱`�N�����b��e��k�W�A��throws�n��
			 * ���������`���ߥX�w�q�w�q���եΪ̳B�z�Ӳ��`.
			 * 
			 * RuntimeException �B��Ȳ��`
			 */
//			throw new RuntimeException("�~�֤��X�k!");
//			throw new Exception("�~�֤��X�k!");
			throw new IllegalAgeException("�~�֤��X�k!");
			
		}
		this.age = age;
	}
	
	
}
