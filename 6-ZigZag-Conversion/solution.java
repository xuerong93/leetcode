public class Solution {
    public String convert(String s, int numRows) {
        //to slow
        if(numRows==1 || numRows>s.length()) return s;
        StringBuilder res=new StringBuilder();
        for(int j=0;j<numRows;j++){
            for(int i=0;i<s.length();i++){
                if(i%(2*numRows-2)==j || i%(2*numRows-2)==2*numRows-2-j){
                    res.append(s.charAt(i));
                }
            }
        }
        return res.toString();
    
    }
}