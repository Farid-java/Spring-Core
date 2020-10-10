package injecting_objectandprimitive_bysemi_annotation_usingcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	 
	public static void main(String[] args) {
	ApplicationContext Context = new ClassPathXmlApplicationContext("injecting_objectandprimitive_bysemi_annotation_usingcontext/context.xml");
		Bean model = (Bean) Context.getBean("bea");
		model.add();
		System.out.println(model);
	}
	
}
