public class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> res = new ArrayList<String>();
     if(n<=0) return res;
     String s="";
     int left=n;
     int right=n;
     dfs(res,left,right,s);
     return res;
     
    }
    public void dfs(List<String> res,int left,int right,String s){
        if(right<left) return;
        if(left==0 && right ==0){
            res.add(s);
            return;
        }
        if(left>0){
            dfs(res,left-1,right,s+"(");
        }
        if(right>0){
            dfs(res,left,right-1,s+")");
        }
        return;
    }
}