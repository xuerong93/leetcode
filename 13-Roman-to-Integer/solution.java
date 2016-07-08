public class Solution {
    public int romanToInt(String s) {
        if(s==null ||s.length()==0) return 0;
        int result=c2n(s.charAt(0));
        for(int i=0;i<s.length()-1;i++){
            if(c2n(s.charAt(i))>=c2n(s.charAt(i+1))){
                result+=c2n(s.charAt(i+1));
            }
            else{
                result+=c2n(s.charAt(i+1))-2*c2n(s.charAt(i));
            }
        }
        return result;
    }
    public int c2n(char c){
            switch(c){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
    }
}