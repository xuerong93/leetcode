public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        s = s.trim(" ");
        String[] arr = s.split(" ");
        int length = arr.length;
        for(int i = 0; i<length/2; i++){
            swap(arr,i,length-1-i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            if(i!=length-1){
                sb.append(arr[i]);
                sb.append(' ');
            }
            else{
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
    public void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}