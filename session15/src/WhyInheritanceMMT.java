class FlightBooking{
	
	String from;
	String to;
	String departureDate;
	int numOfTraverllers;
	String travelClass;
	
	FlightBooking(){
		
	}

	FlightBooking(String from, String to, String departureDate, int numOfTraverllers, String travelClass) {
		super();
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numOfTraverllers = numOfTraverllers;
		this.travelClass = travelClass;
	}
	
	
	void show() {
		System.out.println("FLIGHT DETAILS");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("FROM:  "+from+"  to  "+to);


		System.out.println("Departure Date  "+departureDate);
		System.out.println("TRAVELLERS  "+numOfTraverllers+"  CLASS  "+travelClass);
	}
	
}

class RoundTripFlightBooking extends FlightBooking{
	
	String returnDate;
	
	RoundTripFlightBooking(){
		
	}

	RoundTripFlightBooking(String from, String to, String departureDate, int numOfTraverllers, String travelClass, String returnDate) {
		super(from, to, departureDate, numOfTraverllers, travelClass);
		this.returnDate = returnDate;
		// TODO Auto-generated constructor stub
	}
	
	void show() {
		super.show();
		System.out.println("Return date "+returnDate);
	}
}



public class WhyInheritanceMMT {

	public static void main(String[] args) {

FlightBooking oneWay = new FlightBooking();
oneWay.show();
	
System.out.println();


System.out.println("~~~~~~~~~~~~~~~~~~");
FlightBooking toway = new RoundTripFlightBooking("Delhi","Banglore", "20August", 5, "A", "26August" );
toway.show();
System.out.println("~~~~~~~~~~~~~~~~~~");



	}

}
