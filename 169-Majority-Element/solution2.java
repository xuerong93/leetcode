public class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int m=Integer.MAX_VALUE;
        for(int c:nums){
            if(cnt==0){
                m=c;cnt++;
            }
            else{
                if(m==c) cnt++;
                else cnt--;
            }
        }
        return m;
    }
}