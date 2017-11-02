package ie.gmit.sw;

public class Stacker {

	public static void main(String[] args) {

		InheritanceStack<String> iStack = new InheritanceStack<String>();
		ComposedStack<String> cStack = new ComposedStack<String>();
		
		// Use Intellisense to inspect the available methods of both iStack and cStack
		//iStack.
		//cStack.
		
		// A stack does not add
		iStack.add("Test");
		
		// A stack pushes
		iStack.push("pushing... Hello World");
		
		// A Composed Stack cannot add - this is better design
		//cStack.add("Test");
		
		// A Composed Stack can however push
		cStack.push("pushing... Hello World");
	}

}
