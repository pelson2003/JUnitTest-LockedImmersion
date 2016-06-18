package JUnitLocked;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

public class AssertNullTest {

	@Test
	public void test() {
		ArrayList b = NullPoint.initializer(0);
		assertNull(b);
	}

}
