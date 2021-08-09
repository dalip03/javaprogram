
class Dish{
	
	//property of class
	static int numOfDishes;
	static int totalDishes;
	
	//non static 
	String name;
	int quantity;
	int price;
	
	Dish(){
		name = "NA";
		quantity = 1;
		price = 100;
		totalDishes += quantity;
		numOfDishes++;
		
	}

	Dish(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		totalDishes += quantity;
		numOfDishes++;
	}
	
	void showDish() {
		System.out.println("------------------------------");
		System.out.println(name+"\t"+quantity+"\t"+price);
		System.out.println("-----------------------------");
	}
	
	
	
	
	static void showDishData() {
		System.out.println("numOfDishes: "+numOfDishes);
		
	}
	
}




//Main
public class StaticVsNonStaticApp {

	
	//Main Class 
	public static void main(String[] args) {

		Dish dish1 = new Dish("Dal Makhanai", 1, 100);
	Dish.showDishData();
		
		
	}

}
