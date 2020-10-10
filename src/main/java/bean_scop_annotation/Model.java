package bean_scop_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("prototype")
public class Model {

	@Autowired
	private Bean bean;

	public void get()
	{
		bean.setA(1);
		bean.setName("Farid");
	}
	
	/*
	 * public Model(Bean bean) { super(); this.bean = bean; }
	 * 
	 * 
	 * public Bean getBean() { return bean; }
	 * 
	 * public void setBean(Bean bean) { this.bean = bean; }
	 */
	@Override
	public String toString() {
		return "Model [bean=" + bean + "]";
	}
}
