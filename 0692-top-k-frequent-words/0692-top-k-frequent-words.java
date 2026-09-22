class Solution {

    class pair{
        String word;
        int freq;
        pair(String word,int freq){
            this.word=word;
            this.freq=freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map= new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<pair> pq= new PriorityQueue<>(
            (a,b)->{
                if(a.freq != b.freq){
                    return Integer.compare(a.freq,b.freq);
                }
                return b.word.compareTo(a.word);
            }
        );
        for(Map.Entry< String,Integer>entry : map.entrySet()){
            int freq= entry.getValue();
            String word= entry.getKey();
             pq.add(new pair(word,freq));
        if(pq.size()>k){
            pq.poll();

        }

        }
       
        List <String > ans= new ArrayList<>();
        while(pq.size() != 0){
            pair p= pq.poll();
            ans.add(p.word);
        }
        Collections.reverse(ans);
        return ans;
    }
}