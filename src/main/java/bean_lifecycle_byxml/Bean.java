package bean_lifecycle_byxml;

public class Bean {

private String price, colour;

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getColour() {
	return colour;
}

@Override
public String toString() {
	return "Bean [price=" + price + ", colour=" + colour + "]";
}

public void setColour(String colour) {
	this.colour = colour;
}

public void init1()
{
System.out.println("Init Running ");	
}

public void destroy()
{
	System.out.println("destroy running");
	
}
}
