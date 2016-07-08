public class Solution {
     public String countAndSay(int n) {  
    if(n==0) return "";  
    if(n==1) return "1";  
    String pre="1";  
    for(int i=2; i<=n;i++){  
      StringBuilder cur=new StringBuilder();  
      int count=0;  
      for(int j=0;j<pre.length();j++){  
          count++;  
          if(j==pre.length()-1 || pre.charAt(j)!=pre.charAt(j+1)) {  
            cur.append(count);  
            cur.append(pre.charAt(j));  
            count=0;  
          }  
      }  
      pre=cur.toString();  
    }  
    return pre;  
   }  
}