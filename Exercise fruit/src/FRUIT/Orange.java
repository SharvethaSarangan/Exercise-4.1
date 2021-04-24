package FRUIT;

public class Orange extends Fruit {
	
	private int quantity ;
	private double calories;
	private double price;
	
	public Orange(String n , int q , double d,  double p) {
		super(n);
		this.quantity = q ;
		this.calories = d ;
		this.price = p ;
		
	}
		
	public double caltotalprice() {
	return this.price * this.quantity ;
}
	
	public String toString() {
        return super.toString()+"\nQuantity = "+quantity+
        		                 "\nPrice per Kg = RM"+price+
        		                 "\nCalories per serving = " + calories+
        		                 "\nTotal Price= RM"+caltotalprice();
        

	
}
}
