package main;

import java.util.Queue;

import exceptions.ColaExceededSizeException;
import models.*;

public class prueba {

	public static void main(String[] args) throws ColaExceededSizeException {

		Queue<Integer> cola = new ColaDelCastigo<Integer>(
				(Integer a, Integer b) -> a-b
				);

	
		
	}

}
