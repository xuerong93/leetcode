public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        String[] arr = s.split(" ");
        int length = arr.length();
        for(int i = 0; i<length/2; i++){
            swap(arr,i,length-1-i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length-1;i++){
            sb.append(arr[i]);
            sb.append(' ');
        }
        sb.append(arr[length-1]);
        return sb.toString(sb);
    }
}