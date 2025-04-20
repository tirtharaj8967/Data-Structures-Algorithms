package builder;

public class PhoneBuilder {
	private String OS;
	private int ram;
	private String brand;
	private long battery;
	
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public PhoneBuilder setBattery(long battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(OS,ram,brand,battery);
	}

}
