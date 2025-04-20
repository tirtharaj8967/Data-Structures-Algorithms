package factory;

public class Main {

	public static void main(String[] args) {
		// There is a factory that will provide the Object. If in future any new class add it wont affect the Main.
		 OperatingSystem os= OSFactory.getInstance("Open");
		os.speciality();

	}

}
