class Solution {
    int[] x={1,-1,0,0};
    int[] y={0,0,-1,1};
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int i,j;
        for(j=0;j<n;j++){
            if(board[0][j]=='O'){
                dfs(board,n,m,0,j);
            }
        }
         for(j=0;j<n;j++){
            if(board[m-1][j]=='O'){
                dfs(board,n,m,m-1,j);
            }
        }
           for(i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(board,n,m,i,0);
            }
        }
          for(i=0;i<m;i++){
            if(board[i][n-1]=='O'){
                dfs(board,n,m,i,n-1);
            }
        }

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(board[i][j]=='#'){
                    board[i][j]='O';
                }else{
                    board[i][j]='X';
                }
            }
        }
        return;

    }
   boolean vaild(int i, int j, int m, int n) {
    return i >= 0 && j >= 0 && i < m && j < n;
}

    void dfs(char[][] board,int n,int m,int i, int j){
        board[i][j]='#';
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if(vaild(row,col,m,n) && board[row][col]=='O'){
                dfs(board,n,m,row,col);
            }
        }return;

    }
}