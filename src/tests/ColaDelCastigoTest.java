package tests;

import org.junit.Before;
import org.junit.Test;

import exceptions.ColaExceededSizeException;
import models.ColaDelCastigo;

public class ColaDelCastigoTest {
	private ColaDelCastigo<Integer> c;

	@Test
	public void AddSuccess() {
		Setup();
		assert (c.add(9));
		assert (c.peek() == 9);
	}

	@Test
	public void AddFail() {

		Setup();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		try {
			c.add(10);
		} catch (ColaExceededSizeException e) {
			assert (c.size() == 10);
			assert (!c.contains(10));
		}
	}

	@Before
	public void Setup() {
		c = new ColaDelCastigo<Integer>((Integer a, Integer b) -> a - b);
	}

}
