class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int NoDelete= arr[0];
        int OneDelete= Integer.MIN_VALUE;
        int ans= arr[0];
        for(int i=1;i<n;i++){
            int prevNoDelete= NoDelete;
            int prevOneDelete= OneDelete;
            int v1= arr[i];
            int v2= arr[i]+NoDelete;
            NoDelete= Math.max(v1,v2);
            int v3;
            if(prevOneDelete== Integer.MIN_VALUE){
                v3=arr[i];
            }else{
                v3= prevOneDelete + arr[i];
            }
            OneDelete= Math.max(v3,prevNoDelete);
            ans= Math.max(ans,Math.max(OneDelete,NoDelete));

        }return ans;
    }
}