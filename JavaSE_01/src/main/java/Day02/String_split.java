package Day02;
/**
 * String[] split(String regex)
 * �N��e�r�Ŧ���ӵ��w�����h��F�O�ǰt��
 * �����i����.
 * 
 * @author Otto
 *
 */
public class String_split {

	public static void main(String[] args) {
		String str = "abc123gergerge";
		
		/*
		 * ���ӼƦr�����i����,�o��Ҧ����r������
		 */
		String[] data = str.split("[0-9]+");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

}
