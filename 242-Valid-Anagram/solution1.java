public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null || s.length()!=t.length()) return false;
        int[] s1=new int[26];
        int[] t1=new int[26];
        for(int i=0;i<s.length();i++){
            s1[s.charAt(i)-'a']++;
            t1[t.charAt(i)-'a']++;
        }
        return Arrays.equals(s1,t1);
    }
}