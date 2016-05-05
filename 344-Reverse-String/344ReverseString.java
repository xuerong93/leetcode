public class Solution {
    public String reverseString(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
}