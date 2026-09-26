class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n= profits.length;
        int[][] project= new int[n][2];
        for(int i=0;i<n;i++){
            project[i][0]=capital[i];
            project[i][1]=profits[i];
        }
        Arrays.sort(project,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
        int j=0;
        while(k != 0){
            while(j<n){
                if(project[j][0]>w){
                    break;
                }
                pq.add(project[j][1]);
                j++;
            }
            if(pq.isEmpty()){
                return w;
            }
            w=w+pq.poll();
        k--;
        }
        return w;
    }
}