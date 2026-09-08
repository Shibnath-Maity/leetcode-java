class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int n= nums.length-1;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int guess=(low+high)/2;
            if(nums[guess]>nums[n]){
                low=guess+1;
            }else{
              res=guess;
              high=guess-1;

            }
        }
        return nums[res];
        
    }
}