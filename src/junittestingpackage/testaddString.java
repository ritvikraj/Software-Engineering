package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddString {

	@Test
	public void test() {
		junitfunction junitstring = new junitfunction();
		String result = junitstring.addStrings("Cap","project");
		assertEquals("Capproject",result);
	}

}
