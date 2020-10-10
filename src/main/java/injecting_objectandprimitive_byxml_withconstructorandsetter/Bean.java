package injecting_objectandprimitive_byxml_withconstructorandsetter;

public class Bean {

	private Bean1 bean,hello; // bean and hello should be same as hello and bean name in Bean.xml.
	
	
	/*
	 * public Bean(Bean1 bean, Bean1 hello, int a) { super(); this.bean = bean;
	 * this.hello = hello; this.a = a; }
	 * 
	 */
	public Bean1 getHello() {
		return hello;
	}



	public void setHello(Bean1 hello) {
		this.hello = hello;
	}


	private int a;

	public int getA() {
		return a;
	}

	

	public void setA(int a) {
		this.a = a;
	}

	public Bean1 getBean() {
		return bean;
	}

	public void setBean(Bean1 bean) {
		this.bean = bean;
	}

	
	/* public Bean(Bean1 bean, int a) { super(); this.bean = bean; this.a = a; } */



	@Override
	public String toString() {
		return "Bean [bean=" + bean + ", hello=" + hello + ", a=" + a + "]";
	}
	  
	 
	 
	 
}
