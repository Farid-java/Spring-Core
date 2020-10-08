package inject_object_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/injection/objectref/config.xml");
 A tm=(A) context.getBean("aobj");
 System.out.println(tm.getB().getName());
 System.out.println(tm);
}
}
