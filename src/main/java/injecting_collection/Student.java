package injecting_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private List<String> Book;
	private Set<String> phone;
	private Map<String,String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBook() {
		return Book;
	}
	public void setBook(List<String> book) {
		Book = book;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Book=" + Book + ", phone=" + phone + ", course=" + course + "]";
	} }
