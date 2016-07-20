public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        HashSet<Character> row=new HashSet<Character>();
        //HashSet<Character> column=new HashSet<Character>();
        HashSet<Character> block=new HashSet<Character>();
        //check each row
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.') continue;
                if(row.add(board[i][j])) continue;
                else return false;
            }
            row=new HashSet<Character>();
        }
        //check each column
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[j][i]=='.') continue;
                if(row.add(board[j][i])) continue;
                else return false;
            }
            row=new HashSet<Character>();
        }
        //check each block
        for(int i=0;i<m;i+=Math.sqrt(m)){
            for(int j=0;j<n;j+=Math.sqrt(n)){
                int k=i-1;
                int cnt1=(int) Math.sqrt(m);
                while(cnt1>0){
                    int l=j-1;
                    int cnt2=(int) Math.sqrt(n);
                    k++;
                    cnt1--;
                    while(cnt2>0){
                        l++;
                        cnt2--;
                        if(board[k][l]=='.') continue;
                        if(block.add(board[k][l])) continue;
                        else return false;
                        
                    }
                        
                }
                block=new HashSet<Character>();
            }
        }
        return true;
    }
}