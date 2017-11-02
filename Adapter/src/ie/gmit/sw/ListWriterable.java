package ie.gmit.sw;

public interface ListWriterable {

	public void open(String fileName);
	public void write(String[] list);
	public void close();
}
