package bean_scop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("bean_scop/Bean.xml");
		Model model = (Model) Context.getBean("model");
		System.out.println(model.hashCode());
		
		Model model1 = (Model) Context.getBean("model");
		System.out.println(model1.hashCode());
	}
}
