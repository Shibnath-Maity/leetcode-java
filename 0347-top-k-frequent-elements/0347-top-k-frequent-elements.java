class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;
        PriorityQueue<int[]>pq= new PriorityQueue<>(
            (a,b)->{
                if(a[0] != b[0]){
                    return Integer.compare(a[0],b[0]);
                }else{
                    return Integer.compare(a[1],b[1]);
                }
            }
        );
        HashMap<Integer,Integer> map= new HashMap<>();
       for(int x : nums){
   map.put(x, map.getOrDefault(x, 0) + 1);
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        int element=entry.getKey();
        int freq= entry.getValue();
       
       pq.add(new int[]{freq,element});
       if(pq.size()>k){
        pq.poll();
       }}
       int ans[]= new int[k];
       for(int i=0;i<k;i++){
       ans[i]= pq.poll()[1];
       }

return ans;


        
    }
}