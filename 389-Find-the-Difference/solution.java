public class Solution {
    public char findTheDifference(String s, String t) {
        int[] res = new int[26];
        char[] ss = s.toCharArray();
        for(int i =0; i < ss.length;i++){
            res[ss[i]-'a']++;
        }
        char[] tt = t.toCharArray();
        for(int i=0; i < tt.length; i++){
            res[tt[i]-'a']--;
        }
        int k=0;
        for(;k<26;k++){
            if(res[k]==0){
                continue;
            }else{
                break;
            }
        }
        return (char) (k+'a');
    }
}