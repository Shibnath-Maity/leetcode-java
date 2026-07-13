class Solution {
    public int maxSubArray(int[] nums) {
        int be= nums[0];
          int ans=nums[0];
        for(int i=1;i< nums.length;i++){
            int v1=nums[i]+be;
            int v2= nums[i];
             be=Math.max(v1,v2);
             ans=Math.max(be,ans);
        }return ans;
        
    }
}