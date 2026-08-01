class Solution {
    public int maximumWealth(int[][] accounts) {
        int i=0;
        int j=0;
        int res=0;
        int n= accounts.length;
         int m= accounts[i].length;
        for(i=0;i<n;i++){
               int sum=0;
            for(j=0;j<m;j++){
             
                sum = sum+ accounts[i][j];
                res= Math.max(res,sum);
            }
        }return res;

    }
}