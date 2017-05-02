package models;

import java.util.Comparator;
import java.util.PriorityQueue;

import exceptions.ColaExceededSizeException;

public class ColaDelCastigo<E> extends PriorityQueue<E> {

	private final byte MAX_SIZE = 10;

	public ColaDelCastigo(Comparator<E> comp) {
		super(comp);
	}

	@Override
	public boolean add(E element) throws ColaExceededSizeException {
		if (this.size() < MAX_SIZE) {
			return super.add(element);
		} else {
			throw new ColaExceededSizeException("La cola está llena!");
		}
	}
}
