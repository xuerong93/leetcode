public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        String[] arr = s.split(" ");
        int length = arr.length;
        StringBuilder sb =new StringBuilder();
        for(int i=length-1;i>=0;i--){
            if(!arr[i].equals("")){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length()==0?"":sb.subString(0,sb.length()-1);
    }
}