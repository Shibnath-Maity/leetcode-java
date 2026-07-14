class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int Maxsum= nums[0];
        int ans= Math.abs(nums[0]);
        int Minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1= nums[i];
            int v2= Maxsum+nums[i];
            int v3= Minsum+nums[i];
             Maxsum= Math.max(v1,v2);
             Minsum= Math.min(v1,v3);
            int v4=  Math.abs(Maxsum);
            int v5= Math.abs(Minsum);
            ans= Math.max(ans,Math.max(v4,v5));
            
        }return ans;
        
    }
}