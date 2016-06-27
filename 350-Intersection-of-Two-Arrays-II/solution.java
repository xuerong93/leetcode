public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0) return (new int[0]);
        ArrayList<Integer> res= new ArrayList();
        HashMap<Integer,Integer> table= new HashMap<Integer,Integer>();
        
        for(int i: nums1){
            if(!table.containsKey(i)){
                table.put(i,1);
            }else{
                table.put(i,table.get(i)+1);
            }
        }
        
        for(int i:nums2){
           if(table.containsKey(i)){

                res.add(i);
                if(table.get(i)-1==0){
                    table.remove(i);
                }
                else{
                    table.put(i,table.get(i)-1);
                }
            }
        }
        int[] result = new int[res.size()];
        int k=0;
        for(int i:res){
            result[k]=i;
            k++;
        }
        return result;
    }
}