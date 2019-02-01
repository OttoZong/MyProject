package rc.sum;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rc.bean.Product;

/**
 * 數字加總練習。
 */
public class Ex01 {

	public static void main(String[] args) {
		new Ex01().run();
	}
	
	public void run() {
		quz5();
	}
	
	public void quz1() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(12);
		
	}
	
	public void quz2() {
		List<Double> list = new ArrayList<>();
		list.add(3.32);
		list.add(8.43);
		list.add(12.55);
		
	}
	
	public void quz3() {
		List<BigDecimal> list = new ArrayList<>();
		list.add(new BigDecimal("3.32"));
		list.add(new BigDecimal("8.43"));
		list.add(new BigDecimal("12.55"));
		
	}
	
	public void quz4() {
		List<Product> list = new ArrayList<>();
		BigDecimal Result = new BigDecimal(0);
		
		list.add(new Product("Book", new BigDecimal("39.99")));
		list.add(new Product("iPhone", new BigDecimal("300.55")));
		list.add(new Product("DVD", new BigDecimal("9.33")));
		
		for (int i = 0; i < list.size(); i++) {
			Result = Result.add(list.get(i).getPrice());

		}
		System.out.println(Result);
		
	}
	
	public void quz5() {
		List<Map<String, Object>> list = new ArrayList<>();
		BigDecimal Result = new BigDecimal(0);
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("name", "Book");
		map1.put("price", new BigDecimal("39.99"));
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("name", "iPhone");
		map2.put("price", new BigDecimal("300.55"));
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("name", "DVD");
		map3.put("price", new BigDecimal("9.33"));
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		for (int i = 0; i < list.size(); i++) {
			Result = Result.add((BigDecimal) list.get(i).get("price"));
		}
		System.out.println(Result);
		
	}

}