public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.isEmpty() && str.isEmpty()) return true;
        if(pattern.isEmpty() || str.isEmpty()) return false;
        String[] s = str.split(" ");
        if(pattern.length() != s.length) return false;
        HashMap<Character, String> map1 = new HashMap<Character,String>();
        HashMap<String, Character> map2 = new HashMap<String,Character>();
        for(int i = 0 ;i< pattern.length();i++){
            char c = pattern.charAt(i);
            String temp = s[i];
            if(!map1.containsKey(c)){
                map1.put(c,temp);
            }else{
               if(!map1.get(c).equals(temp)) return false;
            }
                
            if(!map2.containsKey(temp)){
                map2.put(temp,c);
            }else{
                if(!map2.get(temp).equals(c)) return false;
            }
        }
        return true;
    }
}