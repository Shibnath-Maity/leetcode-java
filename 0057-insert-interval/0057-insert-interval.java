class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
  ArrayList<int[]> list = new ArrayList<>();
  for(int[] interval : intervals){
    list.add(interval);
  }
  list.add(newInterval);
  int[][] arr = list.toArray(new int[list.size()][]);
  Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
    list.clear();
    int start1=arr[0][0];
    int end1= arr[0][1];
    for(int i=1;i<arr.length;i++){
        int start2=arr[i][0];
        int end2=arr[i][1];
        if(end1>=start2){
         
            end1=Math.max(end1,end2);
            continue;
        }
     list.add(new int[]{start1, end1});
        start1=start2;
        end1=end2;
    }
     list.add(new int[]{start1, end1});
 return list.toArray(new int[list.size()][]);
}
}