public class Solution {
    public int myAtoi(String str) {
        
        str=str.trim();
        HashSet<Character> s1=new HashSet<Character>();
        char[] nums={'0','1','2','3','4','5','6','7','8','9'};
        for(char num : nums){
            s1.add(num);
        }
        HashSet<Character> s2=new HashSet<Character>();
        s2.add('+');
        s2.add('-');
        if(str==null || str.length()==0 || (!s1.contains(str.charAt(0)) && !s2.contains(str.charAt(0)))){
            return 0;
        }
        int sign=1;
        if(str.charAt(0)=='-'){
            sign=-1;
        }
        double num=0;
        if(str.charAt(0)=='-'){
            for(int i = 1;i<str.length();i++){
                if(s1.contains(str.charAt(i))){
                    num=num*10-(str.charAt(i)-'0');

                }
                else{
                    break;
                }
            }
        }
        if(s1.contains(str.charAt(0)) || str.charAt(0)=='+'){
            int i=0;
            if(str.charAt(0)=='+'){
                i=1;
            }
            for(;i<str.length();i++){
                if(s1.contains(str.charAt(i))){
                    num=num*10+str.charAt(i)-'0';
                }
                else{
                    break;
                }
            }
        }
        if(num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) num;
    }
}