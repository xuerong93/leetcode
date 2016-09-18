public class ValidWordAbbr {
    HashMap<String,HashSet> map = new HashMap<String,HashSet>();
    public ValidWordAbbr(String[] dictionary) {
        for(word : dictionary){
            String s = "";
            int length = word.length();
            if(length<=2) {s=word;}
            else{
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
        if(length<2) return map.contains(word);
        String s = word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
        return map.containsKey(word);
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");