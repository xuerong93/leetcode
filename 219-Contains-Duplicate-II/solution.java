public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int m=0;m<nums.length;m++){
            if(map.containsKey(nums[m])){
                 if( m-map.get(nums[m])<=k) return true;
                 else{
                    map.put(nums[m],m);
                }
            } 
            else{
                map.put(nums[m],m);
            }
        }
        return false;
    }
}