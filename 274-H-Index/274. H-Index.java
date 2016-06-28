public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        
        int length=citations.length;
        int result=0;
        for(int i=0;i<length;i++){
            int min=Math.min(citations[i],length-i);
            result=Math.max(result,min);
        }
        return result;
    }
}