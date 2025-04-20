package builder;

public class Phone {

	private String OS;
	private int ram;
	private String brand;
	private long battery;
	
	
	public Phone(String oS, int ram, String brand, long battery) {
		super();
		OS = oS;
		this.ram = ram;
		this.brand = brand;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", ram=" + ram + ", brand=" + brand + ", battery=" + battery + "]";
	}
	
	
}
