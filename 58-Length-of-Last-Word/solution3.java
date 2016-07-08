public class Solution {
    public int lengthOfLastWord(String s) {
        if (s==null||s.length()==0) return 0;
        int slen=s.length();
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                k++;
            }
            if(k!=0&&s.charAt(i)==' ') return k;
            if(i==0){
                return k;
            }
            
        }
        return 0;
    }
}