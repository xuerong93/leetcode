public class Solution {
    public int numIslands(char[][] grid) {
        //use dfs to go through 1's block to count the island number. After visited the 1, set it to 0 to avoid duplicate. every time find any 1 in the matrix to start dfs
        if(grid == null || grid.length <= 0) return 0;
        
        int len = grid.length;
        int wid = grid[0].length;
        int count = 0;
        for(int i = 0; i<len ; i++){
            for(int j=0; j<wid; j++){
                if(grid[i][j]=='0') continue;
                else{
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        if(grid[i][j] == '0') return;
        grid[i][j]= '0';
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
    }
}