package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() {
		junitfunction junit = new junitfunction();
		int result = junit.addnumbers(100, 200);
		assertEquals(300, result);
	}

}
