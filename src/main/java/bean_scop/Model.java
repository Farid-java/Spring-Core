package bean_scop;

public class Model {

	private Bean bean;

	
	  public Model(Bean bean) { super(); this.bean = bean; }
	 

	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return "Model [bean=" + bean + "]";
	}
}
