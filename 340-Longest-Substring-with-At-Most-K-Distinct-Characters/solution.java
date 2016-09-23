public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s== null || s.length()==0) return 0;
        if(s.length()<k) return s.length();
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        int maxLen = 0;
        int start = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
            while(map.size()>k && start<s.length()){
                char m = s.charAt(start);
                if(map.get(m) != 1){
                    map.put(m,map.get(m)-1);
                }
                else{
                    map.remove(m);
                }
                start++;
            }
            maxLen = Math.max(maxLen, i-start+1);
        }
        return maxLen;
    }
}