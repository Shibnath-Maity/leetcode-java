class Solution {

    class pair{
        char cha;
        int fq;

        pair(int fq,char cha){
            this.cha=cha;
            this.fq=fq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for( char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       PriorityQueue<pair>pq= new PriorityQueue<>(
        (a,b)-> b.fq-a.fq
       );

       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        pq.add(new pair(entry.getValue(),entry.getKey()));
       }
        StringBuilder res= new StringBuilder();

        while(! pq.isEmpty()){
            pair p= pq.poll();
            while(p.fq>0){
            res.append(p.cha);
            p.fq --;}
        }
        return res.toString();
    }
}