public class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        String[] map = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        String s = "";
        while(num!=0){
            s = map[num&15] + s;
            num =num>>>4;
        }
        return s;
    }
}