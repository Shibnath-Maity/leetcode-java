class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
ArrayList<Integer> diary = new ArrayList<>();
        fun(candidates,0,target,res,diary,0);
        
        return res;
        
    }

    void fun(int[] candidates,int idx,int target,List<List<Integer>>res,ArrayList<Integer>diary,int sum){
        int n=candidates.length;
        if (sum == target) {
    res.add(new ArrayList<>(diary));
    return;
}
if(idx==candidates.length || sum> target){
    return;
}
            fun(candidates,idx+1,target,res,diary,sum);
            if(candidates[idx]+sum<= target){
                diary.add(candidates[idx]);
                sum=sum+candidates[idx];
                fun(candidates,idx,target,res,diary,sum);
                diary.remove(diary.size()-1);
                sum=sum-candidates[idx];
            }
            return;
        }
    }
