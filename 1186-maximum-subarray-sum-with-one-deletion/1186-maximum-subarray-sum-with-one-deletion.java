class Solution {
    public int maximumSum(int[] arr) {
       int n= arr.length;
       int res= arr[0];
       int nopower= arr[0];
       int power=0;
       for(int i=1;i<n;i++){
        int v1 = arr[i];
        int v2= nopower + arr[i];
        int v3= power + arr[i];
        int v4= nopower;
       
        nopower= Math.max(v1,v2);
        power= Math.max(v3,v4);
        res= Math.max(res,Math.max(power,nopower));
       }return res;
    }
}