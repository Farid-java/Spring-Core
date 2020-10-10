package bean_scop;

public class Bean {

	private int a;
	private String name;
	public Bean(int a, String name) {
		super();
		this.a = a;
		this.name = name;
		
		
	}
	@Override
	public String toString() {
		return "Bean [a=" + a + ", name=" + name + "]";
	}
	
}
