public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if(s==null) return 0;
        int leftBound = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int j = leftBound;
                leftBound = map.get(c)+1;
                //System.out.println(leftBound);
                while(j<leftBound){
                    map.remove(s.charAt(j));
                    j++;
                }
                map.put(c,i);
            }else{
                map.put(c,i);
            }
            //System.out.println(maxLength);
            maxLength = Math.max(maxLength, i-leftBound+1);
            
        }
        return maxLength;
    }
}