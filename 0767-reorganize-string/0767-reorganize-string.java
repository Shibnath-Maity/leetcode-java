class Solution {

    class pair{
        int count;
        char let;

        pair(int count,char let){
            this.count=count;
            this.let=let;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
       for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       PriorityQueue<pair>pq= new PriorityQueue<>(
        (a,b)-> b.count - a.count

       );
       for(Map.Entry< Character,Integer> entry : map.entrySet()){
        pq.add(new pair(entry.getValue(),entry.getKey()));
       }
       pair prev = null;
StringBuilder res = new StringBuilder();
       while(! pq.isEmpty()){
     pair current= pq.poll();
     res.append(current.let);
     current.count--;

if(prev != null && prev.count>0){
    pq.add(prev);

}
prev=current;
       }
       if(prev != null && prev.count>0){
return "";

}
return res.toString();

        
    }
}