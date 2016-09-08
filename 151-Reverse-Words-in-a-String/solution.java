public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        s=s.trim();
        String[] arr = s.split(" ");
        int length = arr.length;
        String res = "";
        for(int i=length-1;i>=0;i--){
        	if(!arr[i].equals("")){
        		if(i!=0){
                    res+=arr[i];
                    res+=" ";
                }
                else{
                    res+=arr[i];
                }
        	}
            
        }
        return res;
    }
}