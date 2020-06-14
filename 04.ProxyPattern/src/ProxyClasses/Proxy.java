package ProxyClasses;

import OriginalClasses.ConcreteSubject;
import OriginalClasses.Subject;

public class Proxy extends Subject {

	ConcreteSubject cs;
	
	@Override
	public void doSomeWork() {
		// TODO Auto-generated method stub
		System.out.println("Proxy call happening now");
		// Lazy initialization
		if (cs == null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}

}
