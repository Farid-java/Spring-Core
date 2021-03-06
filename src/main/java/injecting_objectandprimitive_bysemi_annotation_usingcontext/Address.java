package injecting_objectandprimitive_bysemi_annotation_usingcontext;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String name, city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
