class Solution {
    public int[][] intervalIntersection(int[][] firstlist, int[][] secondlist) {
        ArrayList<int[]>list= new ArrayList<>();
        int i=0;int j=0;
        while(i<firstlist.length && j< secondlist.length){
            int start=Math.max(firstlist[i][0],secondlist[j][0]);
            int end= Math.min(firstlist[i][1],secondlist[j][1]);
          if(start<=end){
            list.add(new int[]{start,end});
          }
          if(firstlist[i][1] <  secondlist[j][1]){
            i++;
          }else{
            j++;
          }

          }return list.toArray(new int[list.size()][]);
        }
        
    
}