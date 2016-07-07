public class Solution {
    public int myAtoi(String str) {
        str=str.trim();
        if(str==null || str.length()==0 || (((str.charAt(0)!='+'  && str.charAt(0)!='-') && (str.charAt(0)-'0'<0 || str.charAt(0)-'0'>9)))) return 0;
        double num=0;
        if(str.charAt(0)=='-'){
            int i=1;
            while(i<str.length() && (str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9) ){
                num=num*10-(str.charAt(i)-'0');
                i++;
            }
        }else{
            int i=0;
            if(str.charAt(0)=='+'){ i=1;}
            while(i<str.length() && (str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9) ){
                num=num*10+(str.charAt(i)-'0');
                i++;
            }
        }
        if(num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) num;
    }
}