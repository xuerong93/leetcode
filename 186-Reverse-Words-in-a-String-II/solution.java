public class Solution {
    public void reverseWords(char[] s) {
        int length = s.length;
        if(length==0 || length==1) return;
        int i = 0;
        int j = 0;
        while(j<length){
            while(j<length && s[j]==' ' && s[j]==s[j-1]){
                j++;
            }
            s[i] = s[j];
            i++;
            j++;
        }
        for(int m=i;m<j;m++){
            s[m]==' ';
        }
        for(int m=0;m<i/2;m++){
            swap(s,0,i-1);
        }
    }
    public void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] temp;
    }
}