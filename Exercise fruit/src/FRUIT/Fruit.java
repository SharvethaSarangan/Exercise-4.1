package FRUIT;

public class Fruit {
	protected String name;
	public Fruit(String name) {
		this.name = name;
		System.out.println("Fruit constructor is invoked");
		
	}

	public String getName() {
		return this.name;
	}
	
	public String toString() {
	     return "\nFruit Name = "+name;
	   }

}