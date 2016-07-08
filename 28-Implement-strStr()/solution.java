public class Solution {
    public int strStr(String haystack, String needle) {
        
        int l1=haystack.length();
        int l2=needle.length();
        if(l2==0) return 0;
        for(int i=0;i<l1-l2+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=1;
                for(;j<l2;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)) break;
                }
                if(j==l2) return i;
            }
        }
        return -1;
    }
}