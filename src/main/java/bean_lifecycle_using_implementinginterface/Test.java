package bean_lifecycle_using_implementinginterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean_lifecycle_using_implementinginterface/Bean.xml");
	Pepsi p=(Pepsi) context.getBean("pesi");
	context.registerShutdownHook();
	System.out.println(p);
	}
}
