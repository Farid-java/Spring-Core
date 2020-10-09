package spring_EL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bean {
	@Value("#{10+20+60+10}")// SpEL for injecting numeric
	private int a;
	@Value("#{'farid'}")//SpEL for injecting String
	private String name;
	  @Value("#{test }") //SpEL for object injecting :- test is decapitalized of Test Class
	  private Test  constt;
	 @Value("#{T(spring_EL.Test).number1(1) }")//SpEL call for static method
	private int m;
	@Value("#{ new spring_EL.Test().number(9) }")//SpEL call for method
	private int  staticm;
	
public Test getConstt() {  return constt; }

	public void setConstt(Test constt) { this.constt = constt; }

	public int getM() { return m; }

	public void setM(int m) { this.m = m; }

	public int getStaticm() { return staticm;}

	public void setStaticm(int staticm) { this.staticm = staticm; }

	@Override
	public String toString() {
return "Bean [a=" + a + ", name=" + name + ", constt=" + constt + ", m=" + m + ", staticm=" + staticm + "]";
	}

	public int getA() { 	return a ; }

	public void setA(int a) { this.a = a; }

	public String getName() { return name; }

	public void setName(String name) {this.name = name; }
	}
