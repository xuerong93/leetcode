public class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s==null || s.length()==0) return 0;
        int length=s.length()-1;
        int i=length;
        int count=0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}