public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        if(s == null && s.length() < 0 ) return 0;
        int leftBound = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( set.contains(c)){
                while(leftBound<s.length() && s.charAt(leftBound)!=c){
                    set.remove(s.charAt(leftBound));
                    leftBound++;
                }
                leftBound++;
            }else{
                set.add(c);
            }
            maxLength = Math.max(maxLength, i-leftBound+1);
        }
        return maxLength;
    }
}