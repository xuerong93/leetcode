public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        if(s == null && s.length() < 0 ) return 0;
        int start = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( set.contains(c)){
                int j = start;
                while(j<s.length() && s.charAt(j)!=c){
                    set.remove(s.charAt(j));
                    j++;
                }
                start = j+1;
            }else{
                set.add(c);
            }
            maxLength = Math.max(maxLength, i-start+1);
        }
        return maxLength;
    }
}