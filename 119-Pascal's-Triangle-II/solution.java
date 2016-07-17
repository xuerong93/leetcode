public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev=new ArrayList<Integer>();
        List<Integer> current=new ArrayList<Integer>();
        prev.add(1);
        if(rowIndex==0) return prev;
        prev.add(1);
        while(rowIndex>1){
            current.add(1);
            for(int i=0;i<prev.size()-1;i++){
                current.add(prev.get(i)+prev.get(i+1));
            }
            current.add(1);
            rowIndex--;
            prev=current;
            current=new ArrayList();
            
        }
        
        return prev;
    }
}