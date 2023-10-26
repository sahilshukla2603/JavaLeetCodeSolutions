package sahil.practice.java.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class BestSolution {

	public static int lengthOfLongestSubstring(String str) {
		int l=0;
		int r=0;
		int len=0;
		HashMap<Character,Integer> map = new HashMap<>();
		while(r<str.length()) {
			if(map.containsKey(str.charAt(r))) {
				l=Math.max(map.get(str.charAt(r))+1,l);
				map.put(str.charAt(r), r);
			}else {
				map.put(str.charAt(r), r);
			}
			len = Math.max(len, r-l+1);
			r++;
		}
		return len;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abba"));
	}
}
