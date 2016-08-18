public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==null || magazine==null) return false;
        int rlen = ransomNote.length();
        int mlen = magazine.length();
        if(rlen==0) return true;
        if(mlen==0 || rlen>mlen) return false;
        HashMap<Character, Integer> mmap =  new HashMap<Character,Integer>();
        for(int i=0;i<mlen;i++){
            char mchar=magazine.charAt(i);
            if(mmap.containsKey(mchar)){
                mmap.put(mchar,mmap.get(mchar)+1);
            }else{
                mmap.put(mchar,1); 
            }
        }
        for(int i=0;i<rlen;i++){
            char rchar=ransomNote.charAt(i);
            if(mmap.containsKey(rchar)){
                if(mmap.get(rchar)-1!=0){
                    
                    mmap.put(rchar,mmap.get(rchar)-1);
                }else{
                    mmap.remove(rchar);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}