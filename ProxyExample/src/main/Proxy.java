package main;

// Proxy class keep reference on a real subject - Composed
// Define interface which represents the real subject, so it can: act as a surrogate
// Control access to real subject - can be responsible for creation and maintenance of the real subject
public class Proxy implements Subject {
	
	private RealSubject realSubject;
	
	public void doOperation() {
		this.realSubject = new RealSubject();
		this.realSubject.doOperation();
	}
	
	public RealSubject getRealSubject() {
		return this.realSubject;
	}
}
