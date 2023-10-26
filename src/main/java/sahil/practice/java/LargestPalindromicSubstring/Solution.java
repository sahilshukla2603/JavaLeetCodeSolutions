package sahil.practice.java.LargestPalindromicSubstring;
class Solution {
    public String longestPalindrome(String s) {
        String finalString ="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String ck = s.substring(i,j+1);
                if(isPalindrome(ck) && ck.length()>finalString.length() ){
                    finalString=ck;
                }
            }
        }
        return finalString;
    }

    public boolean isPalindrome(String s){
        String str = "";
        for(int k=s.length()-1;k>=0;k--){
            str+=s.charAt(k);
        }
        return str.equals(s);
    }
}