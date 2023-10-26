package sahil.practice.java.PalindromeNumber;

public class NaiveSolution {

	/*-
	 * 
	 * 
	 */
	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			sb.append(s.charAt(i));
		}
		return sb.toString().equals(s);
	}
}
