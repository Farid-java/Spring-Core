package bean_lifecycle_byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean_lifecycle_byxml/Hello.xml"); 
		 Bean b= (Bean) context.getBean("s1"); 
		  context.registerShutdownHook(); System.out.println(b);
		 
    }
}
