public class Solution {
    public int singleNumber(int[] nums) {
        //using extra space
        if(nums.length<=0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0 ; i<nums.length;i++){
            int a = nums[i];
            if(!set.contains(a)){
                set.add(a);
            }else{
                set.remove(a);
            }
        }
        return set.iterator().next();
    }
}