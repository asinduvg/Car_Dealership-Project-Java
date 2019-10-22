package car_dealership;

public class Customer {
	
	String name;
	String address;
	double cashOnHand;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public double getCashOnHand() {
		return cashOnHand;
	}
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		
	}
	
}
