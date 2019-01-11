package Day02;
/**
 * String[] split(String regex)
 * 盢讽玡才﹃酚倒﹚タ玥笷琌で皌
 * 场だ秈︽╊だ.
 * 
 * @author Otto
 *
 */
public class String_split {

	public static void main(String[] args) {
		String str = "abc123gergerge";
		
		/*
		 * 酚计场だ秈︽╊だ,眔┮Τダ场だ
		 */
		String[] data = str.split("[0-9]+");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

}
