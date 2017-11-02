package main;

public class LazySingleton {
	
	// Lazy Singleton
	private static LazySingleton instance;
	
	// Could also be initialized as null
	// private static LazySingleton instance = null;
	
	// private constructor encapsulates
	private LazySingleton(){}

	// static getInstance() method
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
