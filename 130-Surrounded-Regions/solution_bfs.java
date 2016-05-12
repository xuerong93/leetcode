public class Solution {
    
    public Queue<Integer> queue = new LinkedList<Integer>();
    
    public void solve(char[][] board) {
        if(board==null || board.length==0 || board[0].length==0) return;
        
        int x=board.length;
        int y = board[0].length;
        
        for(int i = 0 ;i<x;i++){
            if(board[i][0]=='O') bfs(board,i,0);
            if(board[i][y-1]=='O') bfs(board,i,y-1);
        }
        
        for(int j = 0;j<y;j++){
            if(board[0][j]=='O') bfs(board,0,j);
            if(board[x-1][j]=='O') bfs(board,x-1,j);
        }
        
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
    
    public void bfs(char[][] board,int x, int y){
        int n = board[0].length;
        fillcell(board,x,y);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            int i = cur/n;
            int j = cur%n;
            
            fillcell(board,i-1,j);
            fillcell(board,i+1,j);
            fillcell(board,i,j-1);
            fillcell(board,i,j+1);
        }
    }
    
    public void fillcell(char[][] board,int x,int y){
        int m = board.length;
        int n = board[0].length;
        if(x<0 || x>=m || y<0 || y>=n ||board[x][y] !='O') return;
        queue.offer(x*n+y);
        board[x][y]='#';
    }
}