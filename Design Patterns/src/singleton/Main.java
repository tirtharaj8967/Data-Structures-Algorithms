package singleton;

public class Main {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Abc obj = Abc.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Abc obj = Abc.getInstance();
			}
		});
		t1.start();
		t2.start();
		
		

		//To make this Abc clas thread safe enum is introcuduced. enum id default thread safe.
		Animal animal1 = Animal.INSTANCE;
		animal1.i=10;
		animal1.show();
		
		Animal animal2 = Animal.INSTANCE;
		animal2.i=20;
		animal2.show();
	}

}
class Abc {
	
// If I dont create the object this will a new object when loading with class as it is static and take memory. It is eager loading. to solve that we create object when method is called, this is lazy loaading
//	public static Abc obj= new Abc();
	
//	So we just create the reference variable of Object and load it in the getInstance method
	public static Abc obj;
	
	//Make constructor private to stop calling it and creating new objects
	private Abc() {
		System.out.println("Instance created");
	}
	
	public static Abc getInstance() {
//		If two threads are trying to access the object at same time then both will see the object null and try to create object and the Singleton pattern will not be fulllfilled
//		if(obj == null) {
//			obj = new Abc();
//		}
		
		//Thats why Double Checked Locking is introduced
		if(obj == null) {
			synchronized (Abc.class) {
				if(obj == null) {
					obj= new Abc();
				}
			}

		}
		return obj;
	}
}

enum Animal{
	INSTANCE;
	
	int i;
	void show(){
		System.out.println(" i  is "+ i);
	}
}
