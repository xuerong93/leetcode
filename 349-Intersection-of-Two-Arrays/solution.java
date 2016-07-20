public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums1){
            set.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i:nums2){
            if(set.contains(i)){
                arr.add(i);
                set.remove(i);
            } 
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}