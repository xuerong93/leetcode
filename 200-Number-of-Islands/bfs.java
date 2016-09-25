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
        int m = grid.length;
        int n = grid[0].length;
        //the linkedList stores an integer which represents 2D location 
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(i*m+j);
        while(!queue.isEmpty()){
            int sum = queue.poll();
            grid[sum/m][sum%m]='0';
            if(sum/m-1>0 && grid[sum/m-1][sum%m]=='1'){
                queue.add((sum/m-1)*m+sum%m);
            }
            if(sum/m+1<m && grid[sum/m+1][sum%m]=='1'){
                queue.add((sum/m+1)*m+sum%m);
            }
            if(sum%m-1>0 && grid[sum/m][sum%m-1]=='1'){
                queue.add((sum/m)*m+sum%m-1);
            }
            if(sum%m+1<n && grid[sum/m][sum%m+1]=='1'){
                queue.add((sum/m)*m+sum%m+1);
            }
        }
        return;
    }
}