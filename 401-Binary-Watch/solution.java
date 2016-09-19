public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        helper(res, new boolean[10], 0, num);
        return res;
    }

    void helper(List<String> res, boolean[] choose, int start, int k){
        if(k > 8) return;
        if(k == 0) {
            //(10 choose num) is done, check if time is valid
            int[] cache = new int[]{8,4,2,1,32,16,8,4,2,1};
            int hh = 0, mm = 0;
            for(int i = 0; i < 10; i++){
                if(choose[i]) {
                    if (i < 4) hh += cache[i];
                    else mm += cache[i];
                }
            }
            if(hh<12 && mm < 60){
                if(mm<10) res.add(""+hh+":0"+mm);
                else res.add(""+hh+":"+mm);
            }
        }
        else{
            for(int i = start; i < choose.length-k + 1; i++){
                choose[i] = true;
                helper(res, choose, i+1, k-1);
                choose[i] = false;
            }
        }
    }
}