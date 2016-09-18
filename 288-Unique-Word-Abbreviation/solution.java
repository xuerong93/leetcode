public class ValidWordAbbr {
    HashMap<String,HashSet> map = new HashMap<String,HashSet>();
    public ValidWordAbbr(String[] dictionary) {
        for(String word : dictionary){
            String s = word;
            int length = word.length();
            if(length>2) {
                s = word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
            } 
            if(map.containsKey(s)){
                map.get(s).add(word);
            }
            else{
                HashSet<String> set = new HashSet<String>();
                set.add(word);
                map.put(s,set);
            }
        }
    }

    public boolean isUnique(String word) {
        int length = word.length();
        if(length<=0) return true;
        String s = word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
        if(!map.containsKey(s)) return true;
        else return map.get(s).contains(word)&&map.get(s).size()<=1;
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");