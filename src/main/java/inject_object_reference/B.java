package inject_object_reference;

public class B {

	private int b;
	private String name;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "B [b=" + b + ", name=" + name + "]";
	}
}
