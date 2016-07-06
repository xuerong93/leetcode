public class Solution {
    public String reverseVowels(String s) {
       /*  int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        char[] vowel = {'a','A','e','E','i','I','o','O','u','U'};
        
        while(i<j){
            while (i<=s.length()-1){
                boolean ti = false;
            
                for(int k=0;k<10;k++){
                    ti=ti||(arr[i]==vowel[k]);
                }
                if(!ti){
                   i++;
                }
                else{
                    break;
                }
            }
            
            while (j>=0){
                boolean tj = false;
            
                for(int k=0;k<10;k++){
                    tj=tj||(arr[j]==vowel[k]);
                }
                if(!tj){
                   j--;
                }
                else{
                    break;
                }
            }
            
            if(i<j){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
            j--;
        }
        return String.valueOf(arr); */
        
        /*int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        String vowel = "aeiouAEIOU";
        while(i<j){
            while(i<=s.length()-1 && !vowel.contains(arr[i]+"")){
                i++;
            }
    
            while(j>=0 && !vowel.contains(arr[j]+"")){
                j--;
            }
            
            if(i<j){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
            j--;
        }
        return String.valueOf(arr);*/
        
        ArrayList<Character> vowList = new ArrayList<Character>();
    vowList.add('a');
    vowList.add('e');
    vowList.add('i');
    vowList.add('o');
    vowList.add('u');
    vowList.add('A');
    vowList.add('E');
    vowList.add('I');
    vowList.add('O');
    vowList.add('U');
 
    char[] arr = s.toCharArray();
 
    int i=0; 
    int j=s.length()-1;
 
    while(i<j){
        if(!vowList.contains(arr[i])){
            i++;
            continue;
        }
 
        if(!vowList.contains(arr[j])){
            j--;
            continue;
        }
 
        char t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
 
        i++;
        j--; 
    }
 
    return new String(arr);
    }
}