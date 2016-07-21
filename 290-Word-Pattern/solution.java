public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] word=str.split(" ");
        if(pattern.length()!=word.length) return false;
        HashMap<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsValue(word[i]) && !map.containsKey(pattern.charAt(i))) return false;
            if(!map.containsKey(pattern.charAt(i))){ 
                map.put(pattern.charAt(i),word[i]);
            }
            else if(!map.get(pattern.charAt(i)).equals(word[i])){
                return false;
            }
            
        }
        return true;
    }
}