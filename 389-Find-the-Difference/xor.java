public class Solution {
    public char findTheDifference(String s, String t) {
        String st = s+t;
        char[] sstt = st.toCharArray();
        char res = (char) 0;
        for(int i=0;i<sstt.length;i++){
            res ^= sstt[i];
        }
        return res;
    }
}