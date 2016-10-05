public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            arr[i]=new char[n];
        }
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i], '.');
        }
        backtracking(n, 0, arr, res);
        return res;
    }
    public void backtracking(int n, int k, char[][] arr, List<List<String>> res){
        for(int i=0; i < n ;i++){
            arr[k][i]='Q';
            if(isPossible(n, k, i,arr)){
                if(k == n-1){ 
                    ArrayList<String> temp = new ArrayList<String>();
                    for(char[] c : arr){
                        temp.add(new String(c));
                    }
                    res.add(temp);
                }else{
                    backtracking(n, k+1, arr, res);
                }
            }
            arr[k][i]='.';
        }
    }
    public boolean isPossible(int n, int k,int i, char[][] arr){
        for (int j = 0; j < n; j++)
			if (j == k)
				continue;
			else if (arr[j][i] == 'Q')
				return false;
		for (int j = 0; j <= i; j++)
			if (j == i)
				continue;
			else if (arr[k][j] == 'Q')
				return false;
		for (int p = k - 1, q = i - 1; p >= 0 && q >= 0; p--, q--) {
			if (arr[p][q] == 'Q')
				return false;
		}
		for (int p = k - 1, q = i + 1; p >= 0 && q < n; p--, q++) {
			if (arr[p][q] == 'Q')
				return false;
		}
		return true;
        
        
    }
}