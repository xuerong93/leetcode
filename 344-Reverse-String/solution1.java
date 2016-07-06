public class Solution {
    public String reverseString(String s) {
        if(s==null || s.length()==0 || s.length()==1) return s;
        int length=s.length();
        char[] store=s.toCharArray();
        for(int i=0;i<length/2;i++){
            char temp=store[i];
            store[i]=store[length-i-1];
            store[length-i-1]=temp;
        }
        return new String(store);
    }
}