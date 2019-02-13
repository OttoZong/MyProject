import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {
	public static void main(String[] args) {
		String username = "Otto";
		String list = "buy apple";
		String todo = "go buy apple";

		List<Map<String, Object>> uid = new ArrayList();
		Map<String, Object> result = toGetlist(uid, list, todo);

	}

	private static Map<String, Object> toGetlist(List<Map<String, Object>> uid, String list, String todo) {
		Map<String, Object> result = new HashMap<>();
		result.put(list, todo);
		
		System.out.println("uid:"+uid);
		System.out.println("result:"+result);
		
		return null;
	}
}
