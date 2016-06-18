package JUnitLocked;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeOutTest {

	@Test (timeout = 10000)
	public void test() {
		int three = InfiniteLoop.loop(1);
		assertEquals(1, three,0);
	}

}
