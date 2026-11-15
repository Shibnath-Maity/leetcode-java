class Solution {

class pair{
    int x,y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}

    int[] x={-1,1,0,0};
    int[] y={0,0,-1,1};
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair>q=new LinkedList<>();
        int time=0;
        int fresh=0;
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                    grid[i][j]=-2;
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
          

        }
          while(! q.isEmpty() && fresh>0){
                time++;
                int s=q.size();
                while(s>0){
                   pair p= q.poll();
                    int r=p.x;
                    int c=p.y;
                    for(int k=0;k<4;k++){
                        int row=r+x[k];
                        int col=c+y[k];
                        if(vaild(row,col,m,n) && grid[row][col]==1){
                            q.add(new pair(row,col));
                            grid[row][col]=-2;
                            fresh--;
                        }
                    }
                    s--;
                }
               
           
            }
        if(fresh>0){
    return -1;
}else{
    return time;
}


        
    }
boolean vaild(int i,int j,int m,int n){
    if(i<0 || j<0 || i>=n || j>=m){
        return false;
    }
    return true;
}






}