public class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>s.length()) return s;
        char[] store=s.toCharArray();
        StringBuilder res=new StringBuilder();
        for(int j=0;j<numRows;j++){
            for(int i=0;i<s.length();i++){
                if(i%(2*numRows-2)==j || i%(2*numRows-2)==2*numRows-2-j){
                    res.append(store[i]);
                }
            }
        }
        return res.toString();
    
    }
}