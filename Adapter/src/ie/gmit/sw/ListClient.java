package ie.gmit.sw;

public class ListClient {
	public static void main(String[] args) {
		String[] names = { "John", "Paul", "Mary", "Anne", "Alan", "Barbara" };
		ListWriterable writer = new ArrayStringWriter();
		
		writer.open("test");
		writer.write(names);
		writer.close();
	}
}
