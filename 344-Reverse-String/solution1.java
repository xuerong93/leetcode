public class Solution {
    public String reverseString(String s) {
        if(s==null || s.length() == 0 || s.length() == 1) return s;
        int length = s.length();
        char[] arr = s.toCharArray();
        for(int i=0;i<length/2;i++){
            swap(arr,i,length-1-i);
        }
        return new String(arr);
    }
    public void swap(char[] arr, int start, int end){
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}