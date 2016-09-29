public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(numbers.length<2) return res;
        int len = numbers.length;
        int left =0;
        int right = len-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}