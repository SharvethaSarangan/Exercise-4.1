package FRUIT;


public class Main {


	public static void main(String[] args) {
		
		Fruit obj  = new Fruit("Fruits");
		System.out.println(obj);
		
		Apple obj1= new Apple("Apple",3,5.50);
		System.out.println(obj1);
		
		Orange obj2 = new Orange("Orange" ,4, 8.80 , 80);
		System.out.println(obj2);
		
		Grapes obj3 = new Grapes("Grapes" , 2 , 10.00, 67);
		System.out.println(obj3);
		
		MoonDrops obj4 = new MoonDrops("Moon Dropes" , 5 , 16.00 , 70, "Central California" , "Late July to September");
		System.out.println(obj4);
		
		SweetJubilee obj5 = new SweetJubilee("Sweet Jubilee" , 4 , 25.00 , 65 , "Central California" , "Mid-August to early September");
		System.out.println(obj5);


	}

}
