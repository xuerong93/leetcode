public class Solution {
    public void reverseWords(char[] s) {
        // don't care about how many whitespaces are between two words
         if (s == null || s.length==0 || s.length ==1) return;
         int length = s.length;
         int i = 0;
         for(int j=0;j<length;j++){
             if(s[j]==' '){
                 reverse(s, i, j-1);
                 i=j+1;
             }
         }
         reverse(s,i,length-1);
         reverse(s,0,length-1);
    }
    public void reverse(char[] s, int i, int j){
        while(i<j){
            swap(s, i,j);
            i++;
            j--;
        }
    }
    public void swap(char[] s,int i, int j){
        char temp =s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}