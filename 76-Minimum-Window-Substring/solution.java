public class Solution {
    public String minWindow(String s, String t) {
        String res="";
        if(s==null || t==null) return res;
        
        int tlen=t.length();
        int slen=s.length();
        if(slen==0 || tlen==0 || tlen>slen) return "";
        //store all elements of t in hashmap
        HashMap<Character,Integer> mapt=new HashMap<Character,Integer>();
        for(int i=0;i<tlen;i++){
            char c=t.charAt(i);
            mapt.put(c,mapt.containsKey(c)?mapt.get(c)+1:1);
        }
        
        //initiate min_length of window and count letters of window,track and update it
        int min_length=Integer.MAX_VALUE;
        int letter_count=0;
        
        HashMap<Character,Integer> window = new HashMap<Character,Integer>();
        //two pointers for loop,first find the window that contains all letters in t and then optimize it
        for(int slow=0,fast=0;fast<slen;fast++){
            char c1=s.charAt(fast);
            if(!mapt.containsKey(c1)) continue;
            window.put(c1,window.containsKey(c1)?window.get(c1)+1:1);
            if(window.get(c1)<=mapt.get(c1)) letter_count++;
            //to track if t covers all kinds of elements or not.letter kinds are full and mean to delete duplicate ones
            if(letter_count>=tlen){
                char c2=s.charAt(slow);
                while(slow<fast && (!mapt.containsKey(c2) || window.get(c2)>mapt.get(c2))){
                    
                    if(window.containsKey(c2)){
                      window.put(c2,window.get(c2)-1);
                    }
                  slow++;
                  c2=s.charAt(slow);
                } 
                if(fast-slow+1<min_length){
                    min_length=fast-slow+1;
                    res=s.substring(slow,fast+1);
                }
            }
            
        }
        return res;
    }
}