package sahil.practice.java.RomanToInteger;

import java.util.HashMap;

public class EfficientSolution {

	public int romanToInt(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}
		// Create a map to store Roman numeral values
		HashMap<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);

		int result = romanValues.get(s.charAt(s.length() - 1)); // Initialize result with the last numeral

		for (int i = s.length() - 2; i >= 0; i--) {
			if (romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
				// If the current numeral is smaller than the next numeral, subtract it
				result -= romanValues.get(s.charAt(i));
			} else {
				// Otherwise, add it to the result
				result += romanValues.get(s.charAt(i));
			}
		}

		return result;

	}
}
