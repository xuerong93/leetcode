public class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s==null || s.length()==0) return 0;
        String[] words=s.split(" ");
       //if(words.length<1) return 0;
        return words[words.length-1].length();
    }
}