package inject_object_reference;

public class A {

	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + "]";
	}
	private B b;
}
