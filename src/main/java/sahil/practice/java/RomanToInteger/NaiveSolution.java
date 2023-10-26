package sahil.practice.java.RomanToInteger;

import java.util.HashMap;

public class NaiveSolution {

	public static int romanToInt(String s) {
		HashMap<Character, Boolean> map = new HashMap<>();
		map.put('I', false);
		map.put('V', false);
		map.put('X', false);
		map.put('L', false);
		map.put('C', false);
		map.put('D', false);
		map.put('M', false);
		int finalNumber = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
			case 'I': {
				if (map.get('I')) {
					finalNumber -= 1;
				} else {
					finalNumber += 1;
				}
			}
				break;
			case 'V': {
				if (map.get('V')) {
					finalNumber -= 5;
				} else {
					finalNumber += 5;
				}
				map.put('I', true);

			}
				break;
			case 'X': {
				if (map.get('X')) {
					finalNumber -= 10;
				} else {
					finalNumber += 10;
				}
				map.put('I', true);

			}
				break;
			case 'L': {
				if (map.get('L')) {
					finalNumber -= 50;
				} else {
					finalNumber += 50;
				}
				map.put('X', true);

			}
				break;
			case 'C': {
				if (map.get('C')) {
					finalNumber -= 100;
				} else {
					finalNumber += 100;
				}
				map.put('X', true);
			}
				break;
			case 'D': {
				if (map.get('D')) {
					finalNumber -= 500;
				} else {
					finalNumber += 500;
				}
				map.put('C', true);
			}
				break;
			case 'M': {
				if (map.get('M')) {
					finalNumber -= 1000;
				} else {
					finalNumber += 1000;
				}
				map.put('C', true);
			}
				break;
			}
		}
		return finalNumber;

	}

	public static void main(String[] args) {
		int x = romanToInt("MCMXCIV");
		System.out.println(x);
	}
}
