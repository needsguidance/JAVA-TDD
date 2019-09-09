package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

	@Test
	public void test() {
        JunitTesting test = new JunitTesting();
        String validPassword = "Holaamigos1-";
        assertTrue("Failed to validate password", test.IsValidPassword(validPassword));
	}

}
