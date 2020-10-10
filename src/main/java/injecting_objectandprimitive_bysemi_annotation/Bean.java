package injecting_objectandprimitive_bysemi_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bean {
    @Autowired     // it inject object by Type means => autowiring_byannotation.Address in xml 
	//@Qualifier("bean") // it inject object by name =>  <bean  name="bean"  class="autowiring_byannotation.Address" > in xml.
    @Qualifier("p_schema")//it inject object by name =><bean   name="p_schema"  class="autowiring_byannotation.Address"  p:name="Raju"  p:city="Delhi"  />
	private Address address;

	public void add()
	{
		address.setName("Farid");
		address.setCity("Mumbai");
	}

	@Override
	public String toString() {
		
		return "Bean [address=" + address + "]";
	}

	
}
