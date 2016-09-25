public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int len = grid.length;
        int wid = grid[0].length;
        int count = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < wid; j++){
                if(grid[i][j] == '1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(char[][] grid, int i, int j){
        
        int n = grid.length;
        int m = grid[0].length;
        //the linkedList stores an integer which represents 2D location 
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(i*m+j);
        grid[i][j]='0';
        while(!queue.isEmpty()){
            int sum = queue.poll();
            int k = sum/m;
            int l = sum%m;
            if(k-1>=0 && grid[k-1][l]=='1'){
                queue.add((k-1)*m+l);
                grid[k-1][l]='0';
            }
            if(k+1<n && grid[k+1][l]=='1'){
                queue.add((k+1)*m+l);
                grid[k+1][l]='0';
            }
            if(l-1>=0 && grid[k][l-1]=='1'){
                queue.add(k*m+l-1);
                grid[k][l-1]='0';
            }
            if(l+1<m && grid[k][l+1]=='1'){
                queue.add(k*m+l+1);
                grid[k][l+1]='0';
            }
        }
    }
}