package Day02;

public class TestPoint {
	/*
	 * �Ӥ�k�N�O�N���w��H��toString��k��^�r�Ŧ��X�챱��x��.
	 */
	public static void main(String[] args) {
//		Person p = new Person();
//		p.setAge(60);
//		System.out.println(p.getAge());
		
		Point p = new Point(1,2);
		/*
		 * Object�w�q��toStrimg��k�i�H�N��e��H�ഫ���r�Ŧ�.
		 * �q�{���e����e��H���y�`,�Y:���W@�a�}.
		 * ���y�`�b��ڶ}�o�����N�q���j,�ҥH�q�`�|���g�Ӥ�k.
		 */
		System.out.println(p);
		Point p1 =new Point(1,2);
		/*
		 * ==�O�Ȥ��,�ӤޥΦs���O�a�},
		 * ���D����ܶq���V�P�@�ӹ�H,�_�h��^�Ȭ�false
		 */
		System.out.println(p==p1);//false
		System.out.println(p1);
		/*
		 * equals�OObject���Ѫ���k,�]�p�O�P�_��ӹ�H�����e�O�_�@��
		 * �q�`�ݭn���g�Ӥ�k,�]��Object���Ѫ��Ӥ�k�N�O��"=="�����.
		 */
		System.out.println(p.equals(p1));//?
	}
}
