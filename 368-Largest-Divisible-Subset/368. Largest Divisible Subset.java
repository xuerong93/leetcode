public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();
        if(nums.length<1) return res;
        if(nums.length==1){
            res.add(nums[0]);
            return res;
        } 
        Arrays.sort(nums);
            int[] parent = new int[nums.length];
            int[] count = new int[nums.length];
            int max = 0, maxind = -1;
            for(int i = nums.length - 1; i >= 0; i--){
                for(int j = i; j < nums.length; j++){
                    if(nums[j] % nums[i] == 0 && count[i] < 1 + count[j] ){
                        count[i] = 1 + count[j];
                        parent[i] = j;
                        if(count[i] > max){
                            max = count[i];
                            maxind = i;
                        }
                    }
                }
            }
        for(int i=0;i<max;i++){
            res.add(nums[maxind]);
            maxind=parent[maxind];
        }
        return res;
    }
}