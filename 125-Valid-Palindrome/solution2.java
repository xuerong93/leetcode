public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0) return true;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !isAlphabet(s.charAt(start))) start++;
            while(end>start && !isAlphabet(s.charAt(end))) end--;
            if(start<end){
                if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) return false;
                start++;
                end--;
            }
        }
        return true;
    }
    public boolean isAlphabet(char s){
        if(s>='a'&&s<='z') return true;
        if(s>='A'&&s<='Z') return true;
        if(s>='0'&&s<='9') return true;
        return false;
    }
}