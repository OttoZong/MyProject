package Day02;


	/**
	 * �]���������R�A��kparseXXX(String str)
	 * �Ӥ�k�i�H�N���w���r�Ŧ�ѪR����������
	 * �����ƾ�.�e���O�Ӧr��ॿ�T��ܸӰ�����
	 * �i�H�O�s����.
	 */
public class Integer_parseInt {
	public static void main(String[] args) {
		String str = "123";
		
		int i = Integer.parseInt(str);
		System.out.println(i+1); //124
		
		double d = Double.parseDouble(str);
		System.out.println(d);
	}
}
