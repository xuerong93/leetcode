public class Solution {
    public String reverseVowels(String s) {
        if(s==null || s.length() == 0 || s.length() == 1) return s;
        int length = s.length();
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        char[] arr = s.toCharArray();
        int i = 0;
        int j = length-1;
        while(i<j){
            while(i<length && !set.contains(arr[i])){
                i++;
            }
            while(j>=0 && !set.contains(arr[j])){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
            i++;
            j--;
        }
        return new String(arr);
    }
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}