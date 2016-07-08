public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        int min_length=Integer.MAX_VALUE;
        for(String str: strs){
            if(str.length()==0){
                return "";
            }
            if(str.length()<min_length){
                min_length=str.length();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<min_length;i++){
            char pre=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if( pre!=strs[j].charAt(i)) return sb.toString();
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}