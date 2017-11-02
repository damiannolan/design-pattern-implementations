package ie.gmit.sw;

import java.util.*;

public class ComposedStack<E> implements Stackable<E> {
	
	private List<E> list = new ArrayList<E>();
	
	@Override
	public void push(E obj) {
		list.add(0, obj);
	}

	@Override
	public E pop() {
		return list.remove(0);
	}

	@Override
	public E top() {
		return list.get(0);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();
	}

}
