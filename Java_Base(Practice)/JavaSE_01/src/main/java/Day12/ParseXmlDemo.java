package Day12;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用Dom解析XML文件
 * @author Otto
 *
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		/*
		 * 解析XML的大致步驟
		 * 1.創建SAXReader
		 * 2.使用SAXReader讀取XML文件並生成Document對象.
		 * 這一步驟就是DOM解析耗時耗資源的地方,
		 * 因為要先將XML文件內容全部讀取完畢,並生成一個Document對象.
		 * 3.通過Document獲取根元素
		 * 4.按照XML文件的結構從根元素開始逐級獲取子元素以達到遍歷XML文件數據的目的.
		 */
		/*
		 * 該集合用於保存從emplist.xml文檔中.
		 * 解析出來的員工信息.
		 */
		List<Emp> list = new ArrayList<Emp>();
		
		try {
			//1
			SAXReader reader = new SAXReader();
			
			//2
//			reader.read(new File("emplist.xml"));
			Document doc = reader.read(
					new FileInputStream("emplist.xml")
			);
			System.out.println("讀取完畢!");
			/*
			 * 3
			 * Document提供了獲取根元素的方法:
			 * Element getRootElement()
			 * 
			 * Element的每一個實例用於表示XML文檔中的一個元素(一對標籤).
			 * 
			 * Element 提供了獲取其表示的元素相關信息的方法:
			 * 
			 * String getName()
			 * 獲取標籤的名子
			 * 
			 * String getText()
			 * 獲取標籤中間的文本信息(開始標籤與結束標籤之間的文本)
			 * 
			 * Element element(String name)
			 * 獲取指定名子的子元素
			 * 
			 * List elements()
			 * 獲取所有的子元素
			 * 
			 * List elements(String name)
			 * 獲取所有同名子元素
			 * 
			 * Attribute attribute(String name)
			 * 獲取指定名子的屬性
			 */
			Element root = doc.getRootElement();
			/*
			 * 獲取根元素<list>下面的所有子元素
			 * 若干個<emp>元素.而每一個<emp>元素也是使用Element實例表示,
			 * 並存入一個集合後返回.
			 */
			List<Element> empList = root.elements();
			for(Element empEle : empList){
				//獲取員工姓名
//				System.out.println(empEle.getName());
				Element nameEle = empEle.element("name");
				String name = nameEle.getText();
				System.out.println(name);
				
				//獲取age
				int age = Integer.parseInt(empEle.elementText("age"));
				/*
				 * Element有一個可以快速獲取子標籤中間的文本方法:
				 * String elementText(String name)
				 * 例如:
				 * empEle.elementText("gender")
				 * 等同於
				 * empEle.element("gender").getText()
				 */
				//獲取gender
				String gender = empEle.elementText("gender");
				
				int salary = Integer.parseInt(empEle.elementText("salary"));
				
//				Attribute attr = empEle.attribute("id");
//				int id = Integer.parseInt(attr.getValue());
				int id = Integer.parseInt(empEle.attributeValue("id"));
				
				Emp emp = new Emp(id, name, age, gender, salary);
				list.add(emp);
			}
			
			System.out.println("解析完畢!");
			for(Emp emp : list){
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
