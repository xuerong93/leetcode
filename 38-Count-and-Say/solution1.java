public class Solution {
    public String countAndSay(int n) {
        if(n==0) return "";
        String str = "1";
        StringBuilder sb = new StringBuilder();
        while(n > 1){
            int length = str.length();
            int count = 0;
            char c = str.charAt(0);
            for(int i=0;i<length;i++ ){
                if(str.charAt(i)==c){
                    count++;
                    continue;
                }
                
                    sb.append(count);
                    sb.append(c);
                    count=1;
                    c=str.charAt(i);
                
            }
            sb.append(count);
            sb.append(c);
            str = sb.toString();
            sb = new StringBuilder();
            n--;
        }
        return str;
    }
}