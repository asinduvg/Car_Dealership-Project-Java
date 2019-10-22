package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setName("Tharindu");
		cust1.setAddress("Shanika, Akurugoda, Telijjawila");
		cust1.setCashOnHand(19600);
		
		Vehicle vh1 = new Vehicle();
		vh1.setName("Aqua");
		vh1.setBrand("Toyota");
		vh1.setManufacturedYear(2018);
		vh1.setPrice(4300);
	
		Customer cust2 = new Customer();
		cust2.setName("Ashan");
		cust2.setAddress("No 27, Temple rd, Matara");
		cust2.setCashOnHand(10500);
		
		Vehicle vh2 = new Vehicle();
		vh2.setName("Three Wheeler");
		vh2.setBrand("Bajaj");
		vh2.setManufacturedYear(1998);
		vh2.setPrice(11500);
		
		Employee emp = new Employee();
		cust1.purchaseCar(vh1, emp, false);
		cust2.purchaseCar(vh2, emp, true);
	}

}

