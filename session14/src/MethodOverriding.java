

class ParentClass{
	
	void purchaseBike() {
		System.out.println("Lets purchase a Bike ");
	}
}

class ChildClass extends ParentClass{
	
	void purchaseBike() {
		System.out.println("Lets Purchase Honda Bike");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
 
	
		
		
		ChildClass cref = new ChildClass();
		cref.purchaseBike();
	
		ParentClass sourse= new ParentClass();
		sourse.purchaseBike();
	}

}
