public class Solution {
    public String addBinary(String a, String b) {
        if(a==null ) return b;
        if(b==null) return a;
        int carry=0;
        int p=a.length()-1;
        int q=b.length()-1;
        StringBuilder sb=new StringBuilder();
        while(p>=0 || q>=0){
            int va=0;
            int vb=0;
            if(p>=0){
                va=(a.charAt(p)-'0'==1)?1:0;
                p--;
            }
            if(q>=0){
                vb=(b.charAt(q)-'0'==1)?1:0;
                q--;
            }
            if(va+vb+carry<2){
                sb.append(va+vb+carry);
                carry=0;
            }
            else{
                sb.append(va+vb+carry-2);
                carry=1;
            }
            
        }
        if(carry==1) sb.append(carry);
        return sb.reverse().toString();
    }
}