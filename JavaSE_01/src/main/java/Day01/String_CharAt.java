package Day01;

public class String_CharAt {

	public static void main(String[] args) {
		String str = "thinking in java";
		
		char c = str.charAt(9);
		System.out.println(c);
		
		/*
		 * 浪代ゅ
		 */
		String info ="纯獺︱︱獺纯";
		//タ计竚才籔计竚才常妓
		for(int i=0;i<info.length()/2;i++) {
			char c1 = info.charAt(i);
			char c2 = info.charAt(info.length()-1-i);
			if(c1!=c2) {
				System.out.println("ぃ琌ゅ");
				return; //挡void耞
			}
		}
		System.out.println("琌ゅ");

	}

}
