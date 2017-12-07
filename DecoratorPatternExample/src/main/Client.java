package main;

public class Client {

	public static void main(String[] args) {
		// construct decorated objects
		Component dA = new ConcreteDecoratorA();
		Component dB = new ConcreteDecoratorB();
		
		// call decorated methods
		dA.operation();
		dB.operation();
	}
}
