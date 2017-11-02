package ie.gmit.sw;

public class CypherFactory {
	// Singleton Step 2: Create a static instance 
	// An eager Singleton. 
	//private static CypherFactory cf = new CypherFactory();
	
	// Can do a lazy one too!
	private static CypherFactory cf = null;
	
	// Singleton Step 1: private constructor
	private CypherFactory() {
		
	}
	
	// Singleton Step 3: Static Singleton method
	public static CypherFactory getInstance() {
		if (cf == null) cf = new CypherFactory();
		return cf;
	}
	
	// Add a factory method
	public Cypher newCypher(CypherType type) throws Exception {
		if(type == CypherType.Asymmetric) {
			return new RSACypher();
		} else {
			return new DESCypher();
		}
	}
}
