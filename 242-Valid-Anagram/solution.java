public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null || s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else map.replace(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;
            else map.replace(t.charAt(i),map.get(t.charAt(i))-1);
            if(map.get(t.charAt(i))==0) map.remove(t.charAt(i));
        }
        return true;
    }
}