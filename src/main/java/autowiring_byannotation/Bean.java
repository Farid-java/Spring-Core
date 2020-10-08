package autowiring_byannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bean {
    @Autowired
	@Qualifier("bean")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Bean [address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
