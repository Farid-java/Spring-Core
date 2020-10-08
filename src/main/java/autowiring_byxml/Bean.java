package autowiring_byxml;

public class Bean {

	private Bean1 bean,hello;
	
	public Bean(Bean1 bean, Bean1 hello, int a) {
		super();
		this.bean = bean;
		this.hello = hello;
		this.a = a;
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
