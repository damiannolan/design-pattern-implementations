package ie.gmit.sw;

import java.util.ArrayList;

public class InheritanceStack<E> extends ArrayList<E> implements Stackable<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void push(E obj) {
		super.add(0, obj);
	}

	@Override
	public E pop() {
		return super.remove(0);
	}

	@Override
	public E top() {
		return super.get(0);
	}

	

}
