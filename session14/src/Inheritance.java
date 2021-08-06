class Parent{
	 
      String userName;
      String userID;
      int    wealth;
      
      
      Parent(){
    	  userName = "Dalip";
    	  userID = "dalip@12";
    	  wealth = 50000;
    	  System.out.println("Parent Object Constructed");
      }
      
	Parent(String userName, String userID, int wealth) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.wealth = wealth;
  	  System.out.println("Parent Object Constructed");

	}
      
      void show() {
    	  System.out.println("[PARENT] :>  "+userName+"  |  "+userID+"  |  "+wealth);
      }

}

class Child extends Parent {
	String userName;
	int wealth;
	String compony;
	
	 Child(){
		 userName = "John";
         wealth = 40000;
         compony = "dalip pvt ltd";
        		 System.out.println("Child Object Constructed");
	 }
	
	void show() {
		System.out.println("[Child] :>  "+userName+ "  |  "+wealth+"  |  "+compony);
	super.show();
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Child cref = new Child();
		//cref.wealth -= 10000;
		cref.show();
		
		System.out.println();
		
		Parent cref1 = new Parent();
		cref1.show();
		
		
		
	}

}
