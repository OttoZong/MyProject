import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {
	public static void main(String[] args) {
		List<String> list =new ArrayList();
		list.add("Tom");
		list.add("Cat");
		list.add("John");
		list.add("Otto");
		list.add("Dog");
		
		Collections.sort(list);
		
		for(String s: list){
			System.out.println(s);
		}
	}


}
