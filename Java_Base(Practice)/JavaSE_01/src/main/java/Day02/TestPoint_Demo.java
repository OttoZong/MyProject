package Day02;
/**
 * ����Point���g��Object������k
 * @author Otto
 *
 */
public class TestPoint_Demo {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object�w�q��toString��k
		 * �i�H�N��e��H�ഫ���r�Ŧ�
		 * �q�{���e����e��H���y�`,�Y:
		 * ���W@�a�}
		 * ���y�`�b��ڶ}�o�����N�q���j,�ҥH
		 * �q�`���|���g�Ӥ�k.
		 */
		String str = p.toString();
		System.out.println(str);
	}

}
