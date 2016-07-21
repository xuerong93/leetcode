public class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int[] m=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) bull++;
            else m[secret.charAt(i)-'0']++;
        }
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i) && m[guess.charAt(i)-'0']!=0){
                m[guess.charAt(i)-'0']--;
                cow++;
            }
        }
        StringBuilder sb=new StringBuilder ();
        sb.append(bull);
        sb.append('A');
        sb.append(cow);
        sb.append('B');
        return sb.toString();
        
    }
}