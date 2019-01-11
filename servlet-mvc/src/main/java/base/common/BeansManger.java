package base.common;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 負責解析配置文件(Config.xml),並且利用
 * java反射,將配置文件中的類實例化,
 * 將這些實例添加到集合當中.
 * @author Otto
 *
 */
public class BeansManger {
	private List beans = new ArrayList();
	
	public List getBeans(){
		return beans;
	}
	
	public void parse(String fileName)
		throws Exception{
		
		/**
		 * 解析配置文件，利用java反射，將配置文件中的類
		 * 實例化並存放到集合當中.
		 */
		SAXReader sax = new SAXReader();
		InputStream in = 
				getClass()
				.getClassLoader()
				.getResourceAsStream(fileName);
		try {
			Document doc = sax.read(in); 
			//獲得根元素(beans)
			Element root = doc.getRootElement();
			//獲得根源速下面的所有子元素(bean)
			List<Element> eles = 
					root.elements();
			for(Element ele : eles){
					root.elements();
					//讀取bean元素的class屬性值
					String className = 
							ele.attributeValue("class");
					System.out.println("className:"+ className);
					//利用反射,將類實例化.
					Object obj = 
							Class.forName(className)
							.newInstance();
					//將這些實例添加到集合當中.
					beans.add(obj);
			}
			
			System.out.println("beans:"+beans);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}		
	}
}
