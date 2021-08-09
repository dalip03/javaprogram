class Restaurant{
	String name; 
	String Phone;
	String email;
	String address; 
	float ratings;
	String reviews;
	int pricePerPerson;
	
	Restaurant(String name, String phone, String email, String address, float ratings, String reviews,
			int pricePerPerson) {
		super();
		this.name = name;
		Phone = phone;
		this.email = email;
		this.address = address;
		this.ratings = ratings;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
	}
	
	
	
	Restaurant() {
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public int getPricePerPerson() {
		return pricePerPerson;
	}
	public void setPricePerPerson(int pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}



	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", Phone=" + Phone + ", email=" + email + ", address=" + address
				+ ", ratings=" + ratings + ", reviews=" + reviews + ", pricePerPerson=" + pricePerPerson + "]";
	}



}
	
public class OOPS {
	

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant("Dalip", "6239389593", "dalip@gmail.com","sarabha nagar", 4, "Ausome", 50);
		System.out.println(" "+restaurant);
		
		
	}

}
