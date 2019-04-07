package ENCAPSULATION;//hiding data members.it is all about getters and setters

public class TESTING {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age+30;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name+"surname";
	}
}

