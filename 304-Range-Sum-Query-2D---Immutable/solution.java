public class NumMatrix {
    private int[][] dp;
    public NumMatrix(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        dp=new int[m+1][n+1];
        if(m<=0 || n<=0)  return;
        dp[0][0]=matrix[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i+1][j+1]=dp[i+1][j]+dp[i][j+1]-dp[i][j]+matrix[i][j];
                
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return  dp[row2+1][col2+1]-dp[row1+1][col2+1]-dp[row2+1][col1+1]+dp[row1+1][col1+1];
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);