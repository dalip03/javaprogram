
class Product{
	int id, price, size;
	String name, brand, color ;
	
	Product(){
		
	}

	Product(int id, int price, int size, String name, String brand, String color) {
		super();
		this.id = id;
		this.price = price;
		this.size = size;
		this.name = name;
		this.brand = brand;
		this.color = color;
	}
	
	void show() {
		System.out.println("Product ID : "+id+"  Product Price : "+price+"  size : "+size);
		System.out.println("Product Name : "+name+"  Product Brand : "+brand+"  Product Color : "+color);
	}
	
}


// TV CLASS

class TV extends Product{
	String technology;
	
	TV(){
		
	}

	TV(int id, int price, int size, String name, String brand, String color, String technology) {
		super(id, price, size, name, brand, color);
		this.technology = technology;
	}
	
	void show() {
		super.show();
		System.out.println("Technology :  "+technology);
	}
		
}



// MOBILE CLASS

class Mobile extends Product {
	
	int ram, memory;

	Mobile(){
		super();
	}

	Mobile(int id, int price, int size, String name, String brand, String color,int ram, int memory) {
		super(id, price, size, name, brand, color);
		this.ram = ram;
		this.memory = memory;
	}
	
	void show() {
		super.show();
		System.out.println("RAM : "+ram+"  MEMORY: "+memory);
	}
	
}


 
	



// MAIN CLASS
public class WhyInheritance {

	public static void main(String[] args) {

		TV tv = new TV(01234, 350000, 32, "Haier LED TV", "Haier", "Black", "OLED" );
		tv.show();
		
		
	}

}
