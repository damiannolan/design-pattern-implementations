package ie.gmit.sw;

public class ArrayStringWriter extends SimpleStringWriter implements ListWriterable {

	@Override
	public void write(String[] list) {
		for (String i : list) {
			super.write(i);
		}
	}

}
