package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String title;
	private List<Subscriber> list = new ArrayList<>();
	
	public void subscribe(Subscriber sub) {
		list.add(sub);
	}
	
	public void unsubscribe(Subscriber sub) {
		list.remove(sub);
	}
	
	public void notifySubscriber() {
		
	}
}
