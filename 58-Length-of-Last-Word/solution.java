public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0) return 0;
        String[] words=s.split(" ");
        return words[words.length-1].length();
    }
}