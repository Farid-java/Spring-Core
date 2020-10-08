package bean_lifecycle_using_implementinginterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	private int a;

	@Override
	public String toString() {
		return "Pepsi [a=" + a + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}

	public void destroy() throws Exception {
	System.out.println("destroy");	
	}
	
}
