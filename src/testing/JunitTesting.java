package testing;

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

}
