package ie.gmit.sw;

public interface Stackable<E> {
	public void push(E obj);
	public E pop();
	public E top();
	public int size();
	public boolean isEmpty();
	public void clear();
}
