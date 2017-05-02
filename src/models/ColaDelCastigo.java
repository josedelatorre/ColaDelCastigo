package models;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

import exceptions.ColaExceededSizeException;

public class ColaDelCastigo<E> extends PriorityQueue<E> {

	private final byte MAX_SIZE = 10;

	public ColaDelCastigo(Comparator<E> comp) {
		super(comp);
	}

	@Override
	public boolean add(E element) throws ColaExceededSizeException, NullPointerException {
		if (element != null) {
			if (this.size() <= MAX_SIZE) {
				return super.add(element);
			} else {
				throw new ColaExceededSizeException("La cola está llena!");
			}
		} else {
			throw new NullPointerException("No acepto valores null!");
		}
	}
	
	@Override
	public boolean addAll(Collection<? extends E> collection) throws ColaExceededSizeException, NullPointerException {
		if(collection.size()+this.size() <= MAX_SIZE) {
			return super.addAll(collection);
		} else {
			throw new ColaExceededSizeException("La cola está llena!");
		}
	}
}
