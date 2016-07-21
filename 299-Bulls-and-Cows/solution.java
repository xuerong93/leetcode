public class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int bull=0;
        int cow=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) bull++;
            else{
                if(!map.containsKey(secret.charAt(i))){
                    map.put(secret.charAt(i),1);
                }
                else{
                    map.replace(secret.charAt(i),map.get(secret.charAt(i))+1);
                }
            }
        }
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) continue;
            if(map.containsKey(guess.charAt(i))){
                    map.replace(guess.charAt(i),map.get(guess.charAt(i))-1);
                    cow++;
                    if(map.get(guess.charAt(i))==0){
                        map.remove(guess.charAt(i));
                    }
            }
        }
        sb.append(bull);
        sb.append('A');
        sb.append(cow);
        sb.append('B');
        return sb.toString();
    }
}