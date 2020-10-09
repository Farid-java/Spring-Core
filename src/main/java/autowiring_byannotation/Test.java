package autowiring_byannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring_byannotation/Bean.xml");
		Bean b=(Bean) context.getBean("bea");
		System.out.println(b);
	}
}
