package sahil.practice.java.LongestSubstringWithoutRepeatingCharacters;
/**
 * This solution is O(n^3) time complexity
 */
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		String a = "";
		int i = 0;
		while (i < s.length()) {
			int j = i;
			String subs = "";
			while (j < s.length()) {
				if (subs.contains(s.charAt(j) + "")) {
					break;
				} else {
					subs += s.charAt(j);
				}
				j++;
			}
			if (subs.length() > a.length()) {
				a = subs;
			}
			i++;
		}
		return a.length();

	}
}