package ie.gmit.sw;

public class CompArrayStringWriter implements ListWriterable {

	private SimpleStringWriter ssw = new SimpleStringWriter();

	@Override
	public void open(String fileName) {
		ssw.open(fileName);
	}

	@Override
	public void write(String[] list) {
		for (String i : list) {
			ssw.write(i);
		}
	}

	@Override
	public void close() {
		ssw.close();
	}

}
