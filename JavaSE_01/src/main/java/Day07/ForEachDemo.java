package Day07;
/*
 * �s�`��,�S�٬�:�W�j�`��,for each
 * �s�`���OJDK1.5������X���@�ӯS��.
 * 
 * �s�`�������N�ǲ�for�`�����u�@,�u�ΨӹM�����X�μƲըϥ�.
 */
public class ForEachDemo {
	public static void main(String[] args) {
		String[] array= {"one","two","three","four","five"};
		/*
		 * for�`��
		 */
		for(int i=0;i<array.length;i++) {
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * for each
		 */
		for(String str : array) {
			System.out.println(str);
		}
	}
}
