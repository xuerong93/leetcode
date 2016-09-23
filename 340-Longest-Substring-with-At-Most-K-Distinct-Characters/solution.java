public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s== null || s.length()==0) return 0;
        if(s.length()<k) return s.length();
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        int maxLen = 0;
        int start = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            
                map.put(c,map.containsKey(c)?map.get(c)+1:1);
           
            while(map.size()>k){
                char m = s.charAt(start);
                if(map.containsKey(m)){
                   map.put(m,map.get(m)-1);
                    if(map.get(m)==0){
                        map.remove(m);
                    } 
                }
                
                start++;
            }
            maxLen = Math.max(maxLen, i-start+1);
        }
        return maxLen;
    }
}