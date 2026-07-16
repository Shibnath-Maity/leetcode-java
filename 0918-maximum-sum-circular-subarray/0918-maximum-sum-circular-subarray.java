class Solution {
     static int sum(int[] nums){
        int sum=0;
        for(int j=0;j<nums.length;j++){
           
            sum= sum+nums[j];
        }return sum;
     }
    public int maxSubarraySumCircular(int[] nums) {
        int max= nums[0];
        int min= nums[0];
        int maxAns = nums[0];
int minAns = nums[0];
        int res = nums[0];
        int total=sum(nums);
        for(int i=1;i<nums.length;i++){
                   
            int v1= nums[i];
            int v2= nums[i]+max;
            int v3= nums[i]+min;
            max=Math.max(v1,v2);
            min = Math.min(v1,v3);
            maxAns= Math.max(maxAns,max);
            minAns= Math.min(minAns,min);
     
           int A1= total - minAns;
           res= Math.max(res,Math.max(A1,max));

        }if(maxAns<0){
            return maxAns;
        }
        return res;
        
    }
}