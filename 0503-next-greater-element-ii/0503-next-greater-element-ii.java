class Solution {
    public int[] nextGreaterElements(int[] nums) {
             int n= nums.length;
        int[] res= new int[n];
             Stack<Integer> s= new Stack<>();
        res[n-1]=-1;
        s.push(nums[n-1]);

        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
        while(! s.isEmpty() && s.peek()<= nums[index]){
            s.pop();}
            
            if(s.isEmpty()){
                res[index]=-1;
            }else{
                res[index]=s.peek();

            }
        s.push(nums[index]);
        
        }return res;

        }

        
    }
