package injecting_objectandprimitive_byxml_withconstructorandsetter;

public class Bean1 {

	private String name, city;

@Override
public String toString() {
return "Bean1 [name=" + name + ", city=" + city + "]";
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
