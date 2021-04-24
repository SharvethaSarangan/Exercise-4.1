package FRUIT;

public class MoonDrops extends Grapes {
	
	private String place;
	private String season;
	
	public MoonDrops(String n , int q , double c, double p, String g , String s) {
		super(n ,q ,c, p);
		this.place = g;
		this.season = s;
	    }
		

	public String Growingplace() {
	return this.place;
	}
	
	public String Season() {
	return this.season;
	}
	
    public double caltotalprice() {
	return this.price * this.quantity ;
    }
	
	
	public String toString() {
        return super.toString()+"\nQuantity = "+ quantity+
        		                 "\nPrice per Kg = RM"+ price+
        		                 "\nCalories per 100g = " + calories+
        		                 "\nMoon Drops will grow at : " + place +
        		                 "\nSeason : " + season +
        		                 "\nTotal Price= RM"+caltotalprice();
        	
}
}

