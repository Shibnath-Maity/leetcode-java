class Solution {
    static int sum(int[] nums){
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum= sum+nums[i];
        }return sum;
    }
    public int pivotIndex(int[] nums) {
        int total= sum(nums);
        int left=0;

        if(total - nums[0] == 0)    // Check index 0
            return 0;
        for(int i=1;i<nums.length;i++){
            left = left + nums[i-1];
            int right = total-nums[i]-left;
            if(right == left){
                return i;
            }
        }return -1;
    }
}