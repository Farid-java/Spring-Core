package injecting_objectandprimitive_byxml_withconstructorandsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("injecting_objectandprimitive_byxml_withconstructorandsetter/Bean.xml");
	Bean b=(Bean) cont.getBean("bea");
 
	System.out.println(b);
	}
}
