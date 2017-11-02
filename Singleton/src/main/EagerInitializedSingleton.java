package main;

public class EagerInitializedSingleton {
	// Eager Initialized Singleton
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
    
    // getInstance() static method
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
