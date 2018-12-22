package Day02;
/**
 * 
 * @author Otto
 *
 */
public class String_Builder {

	public static void main(String[] args) {
		/*
		 * �q�{�Ыت�ܪŦr�Ŧ�
		 * �]�i�H�ǤJ�@�Ӧr�Ŧ�
		 */

		String str = "�n�n�ǲ�Java";
		StringBuilder builder = new StringBuilder(str);
		/*
		 * �n�n�ǲ�Java
		 * �n�n�ǲ�Java,���F����n�u�@!
		 * 
		 * append��k���γ~�O�N���w���r�Ŧ�
		 * �K�[���e�r�Ŧꪺ����.
		 */
		builder.append(",���F����n�u�@!");
		str = builder.toString(); //��^str
		System.out.println(str);
		
		/*
		 * �n�n�ǲ�Java,���F����n�u�@!
		 * �n�n�ǲ�Java,�N�O���F���ܥ@��!
		 * 
		 * replace�i�H�N��e�r�Ŧꤤ���w�d��
		 * �����e�������w���r�Ŧ�
		 */
		
		builder.replace(9, 16, "�N�O���F���ܥ@��!");
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * �n�n�ǲ�Java,�N�O���F���ܥ@��!
		 * ,�N�O���F���ܥ@��!
		 * 
		 * delete�N��e�r�Ŧꤤ���w�d��
		 * ���r�Ŧ�R��
		 */
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * ,�N�O���F���ܥ@��! 
		 * ����,�N�O���F���ܥ@��!
		 * 
		 * insert�N���w���r�Ŧ괡�J��e
		 * �r�Ŧꪺ���w��m
		 */
		
		builder.insert(0, "����");
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * ����r�Ŧ�
		 */
		
		builder.reverse();
		str = builder.toString();
		System.out.println(str);
	}

}
