package injecting_objectandprimitive_bysemi_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("injecting_objectandprimitive_bysemi_annotation/Bean.xml");
		Bean b=(Bean) context.getBean("bea");
		System.out.println(b);
		System.out.println(b.hashCode());
		Bean b1=(Bean) context.getBean("bea");
		 b1.add();
		 System.out.println(b1.hashCode());
		 System.out.println(b1);
		 
	}
}
