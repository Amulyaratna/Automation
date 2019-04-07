package FunctionOverloading;

public class Car {

	String name ="Hexa";
	String model ="SUV";
	int wheels =4;
	String color ="Red";
	
	public Car(String name, String model, int wheels, String color) {
		super();
		this.name = name;
		this.model = model;
		this.wheels = wheels;
		this.color = color;
	}

	public Car() {
		
	}
	
	public void drive()
	{
		Car c =new Car();
		
		System.out.println("this" + " " +c.name+ " " +"has"+ " " +c.wheels+ " "+ " wheelss");
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		
		
		
		c.drive();
		c.pradnya();
		c.specification();	
		
		
	}

	
	public void pradnya()
	{
		System.out.println("The "+name+" car transports passengers from Pune to Mumbai");
	}
	public void specification()
	{
		System.out.println("The "+name+" car of model"+model+" have"+wheels+" wheels and in "+color+" color");
	}
	
	
}
