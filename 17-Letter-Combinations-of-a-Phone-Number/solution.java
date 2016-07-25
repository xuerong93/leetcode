public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits==null || digits.length()==0) return res;
        HashMap<Character,String> map = new HashMap<Character, String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        ArrayList<Character> item=new ArrayList<Character>();
        letterCombinations(res,item,map,digits,0);
        return res;
    }
    public void letterCombinations(List<String> res, ArrayList<Character> item, HashMap<Character,String> map,String digits, int index){
        if(index==digits.length()){
            //to merge cahracter arraylist into string
             char[] temp=new char[item.size()];
             for(int i=0;i<item.size();i++){
                 temp[i]=item.get(i);
             }
             res.add(String.valueOf(temp));
             return;
        }
        if(index<digits.length()){
            char digit=digits.charAt(index);
            String val=map.get(digit);//String like "abc"
            for(int i=0;i<val.length();i++){
                    item.add(val.charAt(i));
                    letterCombinations(res, item,map,digits,index+1);
                    item.remove(item.size()-1);
            }
        }
        
    }
}