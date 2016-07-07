public class Solution {
    public String reverseVowels(String s) {
        char[] vowel="aeiouAEIOU".toCharArray();
        int length=s.length();
        char[] store=s.toCharArray();
        int i=0;
        int j=length-1;
        while(i<j){
            int k=0;
            int m=0;
            while(k<10){
                if(store[i]==vowel[k]) break;
                if(k==9){
                    i++;
                    k=-1;
                }
                if(i>length-1) break;
                k++;
            }
            while(m<10){
                if(store[j]==vowel[m]) break;
                if(m==9){
                    j--;
                    m=-1;
                }
                if(j<0) break;
                m++;
            }
            if(i<j){
                char temp=store[i];
                store[i]=store[j];
                store[j]=temp;
            }
            
            i++;
            j--;
        }
        return new String(store);
    }
}