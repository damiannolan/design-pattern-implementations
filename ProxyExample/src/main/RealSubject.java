package main;

// Real Subject class is a real object which is represented by Proxy
public class RealSubject implements Subject {
	
	public void doOperation() {
		System.out.println("Doing operation");
	}
}
