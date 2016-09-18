public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] split = s.toCharArray();
        for(char c:split){
            map.put(c,map.containsKey(c)? map.get(c)+1:1);
        }
        for(int i = 0; i<split.length;i++){
            if(map.get(split[i])==1) return i;
        }
        return -1;
    }
}