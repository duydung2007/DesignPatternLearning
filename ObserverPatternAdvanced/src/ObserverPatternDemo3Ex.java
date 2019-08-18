import java.util.ArrayList;
import java.util.List;

interface IObserver {
	void update(String className, int i);
}

interface ISubject {
	void register(IObserver observer);
	void unRegister(IObserver observer);
	void notifyAllObserver(int value);
}

class Observer1 implements IObserver {

	@Override
	public void update(String className, int i) {
		// TODO Auto-generated method stub
		System.out.println("Observer 1 updated value for " + className + " to " + i);
	}
	
}

class Observer2 implements IObserver {

	@Override
	public void update(String className, int i) {
		// TODO Auto-generated method stub
		System.out.println("Observer 2 updated value for " + className + " to " + i);
	}
	
}

class Observer3 implements IObserver {

	@Override
	public void update(String className, int i) {
		// TODO Auto-generated method stub
		System.out.println("Observer 3 updated value for " + className + " to " + i);
	}
	
}

class Subject1 implements ISubject {
	List<IObserver> listObserver = new ArrayList<IObserver>();
	int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyAllObserver(value);
	}

	@Override
	public void register(IObserver observer) {
		// TODO Auto-generated method stub
		if (!listObserver.contains(observer)) {
			listObserver.add(observer);
		}
	}

	@Override
	public void unRegister(IObserver observer) {
		// TODO Auto-generated method stub
		listObserver.remove(observer);
	}

	@Override
	public void notifyAllObserver(int value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listObserver.size(); ++i) {
			listObserver.get(i).update(this.getClass().getSimpleName(), value);
		}
	}
	
}

class Subject2 implements ISubject {
	List<IObserver> listObserver = new ArrayList<IObserver>();
	int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyAllObserver(value);
	}
	
	@Override
	public void register(IObserver observer) {
		// TODO Auto-generated method stub
		if (!listObserver.contains(observer)) {
			listObserver.add(observer);
		}
	}

	@Override
	public void unRegister(IObserver observer) {
		// TODO Auto-generated method stub
		listObserver.remove(observer);
	}

	@Override
	public void notifyAllObserver(int value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listObserver.size(); ++i) {
			listObserver.get(i).update(this.getClass().getSimpleName(), value);
		}
	}
	
}


public class ObserverPatternDemo3Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject1 sub1 = new Subject1();
		Subject2 sub2 = new Subject2();
		
		IObserver ob1 = new Observer1();
		IObserver ob2 = new Observer2();
		IObserver ob3 = new Observer3();
		
		sub1.register(ob1);
		sub1.register(ob2);
		sub1.register(ob2);
		
		sub2.register(ob2);
		sub2.register(ob3);
		
		sub1.setValue(50);
		System.out.println();
		
		sub2.setValue(250);
		System.out.println();
		
		sub1.unRegister(ob2);
		
		sub1.setValue(550);
		System.out.println();
		
		sub2.setValue(750);
		
	}

}
