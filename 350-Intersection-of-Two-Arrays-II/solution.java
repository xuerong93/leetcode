public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int k=0;
        for(int i:nums1){
            if(!map.containsKey(i))   map.put(i,1);
            else map.replace(i,map.get(i)+1);
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
              arr.add(i);
              map.replace(i,map.get(i)-1);
            } 
            
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}