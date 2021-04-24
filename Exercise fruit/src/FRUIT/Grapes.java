package FRUIT;

public class Grapes extends Fruit {
	
	protected int quantity ;
	protected double calories;
	protected double price;
	
	public Grapes(String n , int q , double c,  double p) {
		super(n);
		this.quantity = q ;
		this.calories = c ;
		this.price = p ;
		
	}
		
	public double caltotalprice() {
	return this.price * this.quantity ;
}
	
	public String toString() {
        return super.toString()+"\nQuantity = "+quantity+
        		                 "\nPrice per Kg = RM"+price+
        		                 "\nCalories per 100g = " + calories+
        		                 "\nTotal Price= RM"+caltotalprice();
        

	
}
}


