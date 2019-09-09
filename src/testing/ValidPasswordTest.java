package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

        @Test
        public void test() {
                JunitTesting test = new JunitTesting();

                // Password under 8 characters
                String password = "Hello";
                assertFalse("Passwords under 8 characters should be invalid!", test.IsValidPassword(password));

                // Valid password length, however does not contain atleast 1 upper case letter,
                // 1 digit nor any special characters
                password = "helloworld";
                assertFalse("Password must contain at least 1 upper case letter, 1 digit and special characters",
                                test.IsValidPassword(password));

                // Valid password length and upper case character, however does not contain at
                // least 1 number nor special characters
                password = "Helloworld";
                assertFalse("Password must contain at least 1 digit and special characters",
                                test.IsValidPassword(password));

                // Password missing special characters
                password = "HelloWorld1";
                assertFalse("Password must have special characters", test.IsValidPassword(password));

                // Valid password
                password = "HelloWorld1-";
                assertTrue("Failed to validate password", test.IsValidPassword(password));
        }

}
