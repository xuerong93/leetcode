public class Solution {
    public int myAtoi(String str) {
        if(str==null || str.length()==0) return 0;
        str = str.replace(" ","");
        double result = 0 ;
        if(str.charAt(0)-'0'>=0 && str.charAt(0)<='9'){
            int i=0;
            while(str.length()>0 && str.charAt(i)-'0'>=0 && str.charAt(i)<='9'){
                result = 10*result+str.charAt(i)-'0';
                i++;
            }
        }
        if(str.charAt(0)=='+' || str.charAt(0)=='-'){
            if(str.charAt(0)=='+'){
                int i=1;
                while(str.length()>0 && str.charAt(i)-'0'>=0 && str.charAt(i)<='9'){
                    result = 10*result+str.charAt(i)-'0';
                    i++;
                }
            }
            else{
                int i=1;
                while(str.length()>0 && str.charAt(i)-'0'>=0 && str.charAt(i)<='9'){
                    result = 10*result-str.charAt(i)-'0';
                    i++;
                }
            }
        }
        
        if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }
}