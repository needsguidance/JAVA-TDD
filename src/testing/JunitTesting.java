package testing;

import java.util.regex.Pattern;

public class JunitTesting {

	/**
	 * Calculate a square of an integer number
	 * 
	 * @param x
	 * @return
	 */
	public int square(int x) {
		return x * x;
	}

	/**
	 * Count how many A's contains on string.
	 * 
	 * @param word
	 * @return
	 */
	public int countA(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count++;
			}
		}

		return count;
	}

	public boolean ContainsUpperCase(String s) {
		String s2 = s.toLowerCase();
		return !s.equals(s2);
	}

	public boolean ContainsNumber(String s) {
		return s.matches(".*\\d.*");
	}

	public boolean ContainsSpecialCharacter(String s) {
		Pattern regex = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		return regex.matcher(s).find();
	}

	public boolean IsValidPassword(String password) {
		return password.length() > 7 && ContainsUpperCase(password) && ContainsNumber(password)
				&& ContainsSpecialCharacter(password);
	}

}
