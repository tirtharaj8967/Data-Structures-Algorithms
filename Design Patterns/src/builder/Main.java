package builder;

public class Main {
	public static void main(String[] args) {
		Phone p = new Phone("iOS", 6, "Apple", 5000);
		System.out.println(p.toString());
		
		//This is builder design pattern.
		Phone phone = new PhoneBuilder().setOS("iOS").setRam(6).setBrand("Realme").setBattery(6000).getPhone();
		System.out.println(phone.toString());

	}
}
