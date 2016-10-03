public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for(int i=0; i<tt.length; i++){
            map.put(tt[i], map.containsKey(tt[i])?(map.get(tt[i])+1):1);
        }
        for(int i=0; i < ss.length;i++){
            if(map.containsKey(ss[i])){
                map.put(ss[i],map.get(ss[i])-1);
                if(map.get(ss[i])==0){
                    map.remove(ss[i]);
                }
            }
        }
        Set<Character> set = map.keySet();
        Iterator<Character> itr = set.iterator();
        char res='0';
        while(itr.hasNext()){
            res = itr.next();
        }
        return res;
    }
}