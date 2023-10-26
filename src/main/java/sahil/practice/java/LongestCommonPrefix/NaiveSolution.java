package sahil.practice.java.LongestCommonPrefix;

public class NaiveSolution {

	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		String s1 = strs[0];
		boolean cont = true;
		for (int i = 0; i < s1.length(); i++) {
			for (String s : strs) {
				if (i < s.length() && s.charAt(i) == s1.charAt(i)) {
					continue;
				}
				cont = false;
				break;
			}
			if (!cont) {
				break;
			}
			sb.append(s1.charAt(i));
		}

		return sb.toString();
	}
}
