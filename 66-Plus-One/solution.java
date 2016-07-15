public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int num=digits[i];
            
            digits[i]=(num+carry)%10;
            carry=(num+carry)/10;
            
        }
        if(carry==0) return digits;
        else{
            int[] res=new int[digits.length+1];
            res[0]=carry;
            for(int i=digits.length-1;i>=0;i--){
                res[i+1]=digits[i];
            }
            return res;
        }
    }
}