package JUnitLocked;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTest {

	@Test
	public void test() {
		int three = Math.add(4, 5);
		assertEquals(9, three, 0);
	}

}
