public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList();

        for(int i=0;i<nums1.length;i++){
            if(!set1.contains(nums1[i])){
                set1.add(nums1[i]);
            }
        }
        for(int j=0;j<nums2.length;j++){
            if(set1.contains(nums2[j])){
                set1.remove(nums2[j]);
                res.add(nums2[j]);
            }
        }
        int[] result = new int[res.size()];
        int k=0;
        for(int i: res){
            result[k]=i;
            k++;
        }
        return result;
    }
}