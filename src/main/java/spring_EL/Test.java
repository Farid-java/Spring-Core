package spring_EL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	public static void main(String[] args) {
	ApplicationContext c=	new ClassPathXmlApplicationContext(" spring/expressionlanguage/Bean.xml");
	 Bean b=c.getBean("bean", Bean.class)	;
	 System.out.println(b);
	}

	public int number(int a)
	{  return a; }
   
	public static int number1(int z)
	{  return z; }
	
}
