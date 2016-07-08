public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0 || s.length()==1) return true;
        s=s.replace(" ","");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isAlphabet(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        s=sb.toString().toLowerCase();
        int length=s.length();
        int start=0;
        int end=length-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
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