public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        if(numRows==0) return res;
        List<Integer> prev=new ArrayList<Integer>();
        prev.add(1);
        while(numRows>0){
            res.add(prev);
            List<Integer> current=new ArrayList<Integer>();
            current.add(1);
            for(int i=0;i<prev.size()-1;i++){
                current.add(prev.get(i)+prev.get(i+1));
            }
            current.add(1);
            prev=current;
            numRows--;
        }
        return res;
    }
}