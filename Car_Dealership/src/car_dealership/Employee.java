package car_dealership;

public class Employee {
	String name;
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			runCreditHistory(cust, vehicle);
		}else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		}else {
			System.out.println("Bring more money!!");
		}
	}
	
	public void runCreditHistory(Customer cust, Vehicle vehicle) {
		double credit = vehicle.getPrice() - cust.getCashOnHand();
		System.out.println("Vehicle " + vehicle.getName() + " has been bought with " + credit + " of lease");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Vehicle " + vehicle.getName() + " has been bought by " + cust.getName());
	}
}
