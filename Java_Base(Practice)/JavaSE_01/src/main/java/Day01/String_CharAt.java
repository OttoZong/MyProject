package Day01;

public class String_CharAt {

	public static void main(String[] args) {
		String str = "thinking in java";
		
		char c = str.charAt(9);
		System.out.println(c);
		
		/*
		 * �˴��^��
		 */
		String info ="�����H�����H����";
		//���Ʀ�m���r�ŻP�˼Ʀ�m���r�ų��@��
		for(int i=0;i<info.length()/2;i++) {
			char c1 = info.charAt(i);
			char c2 = info.charAt(info.length()-1-i);
			if(c1!=c2) {
				System.out.println("���O�^��");
				return; //����void�P�_
			}
		}
		System.out.println("�O�^��");

	}

}
