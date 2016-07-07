public class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1 || numRows>s.length()) return s;
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0;i<numRows;i++){
            int interval=2*(numRows-1)-2*i;
            for(int j=i;j<s.length();j+=2*(numRows-1)){
                res.append(s.charAt(j));
                count++;
                if(interval>0 && interval<2*(numRows-1) && j+interval<s.length() && count<s.length() ){
                    res.append(s.charAt(j+interval));
                    count++;
                }
            }
        }
        return res.toString();
    
    }
}