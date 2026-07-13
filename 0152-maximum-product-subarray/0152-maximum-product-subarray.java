class Solution {
    public int maxProduct(int[] nums) {
        int maxe= nums[0];
        int mine= nums[0];
        int res=nums[0];
        for(int i=1; i<nums.length;i++){
            int v1= nums[i];
            int v2= nums[i]*maxe;
            int v3 = nums[i]*mine;
            maxe= Math.max(v1,Math.max(v2,v3));
            mine= Math.min(v1,Math.min(v2,v3));
            res= Math.max(res,Math.max(maxe,mine));
        }return res;
        
    }
}