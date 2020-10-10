package injecting_objectandprimitive_bysemi_annotation_usingcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "bea")// value : this is a name attribute of bean tag in xml when we use xml injecting.
public class Bean {
	
	
    @Autowired     // it inject object by Type means => autowiring_byannotation.Address in xml 
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
