package bean_scop_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
	ApplicationContext Context = new ClassPathXmlApplicationContext("bean_scop_annotation/beanscop.xml");
		Model model = (Model) Context.getBean("model");
		System.out.println(model.hashCode());
		
		
		  Model model1 = (Model) Context.getBean("model");
		  System.out.println(model1.hashCode());
		 
	}
}
