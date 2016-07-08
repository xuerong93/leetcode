public class Solution {
    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder();
        StringBuilder num=new StringBuilder();
        if(n<=0) return sb.toString();
        sb.append("1");
        for(int i=1;i<n;i++){
            String sbString=sb.toString();
            
            for(int j=0;j<sbString.length();j++){
                int count=0;
                char start=sbString.charAt(j);
                while(j<sbString.length() && sbString.charAt(j)==start ){
                    count++;
                    j++;
                } 
                num.append(count);
                num.append(sbString.charAt(--j));
            }
            sb=num;
            num=new StringBuilder();            
            
        }
        return sb.toString();
    }
}