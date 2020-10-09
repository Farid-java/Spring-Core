package autowiring_byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("autowiring_byxml/Bean.xml");
	Bean b=(Bean) cont.getBean("bea");
 
	System.out.println(b);
	}
}
