class Solution {
    public int maxNumberOfBalloons(String s) {
     int res= Integer.MAX_VALUE;
     HashMap< Character, Integer> have= new HashMap<>();
     HashMap< Character, Integer> need= new HashMap<>();
     for(char c: s.toCharArray()){
        have.put(c, have.getOrDefault(c,0)+1);
     } String t = "balloon";
     for(char ch : t.toCharArray()){
        need.put(ch,need.getOrDefault(ch,0)+1);
     }
     for(Map.Entry<Character, Integer> i : need.entrySet()){
        char c= i.getKey();
        int fneed= i.getValue();
        int fhave= have.getOrDefault(c,0);
        int time= fhave/fneed;
        res= Math.min(res,time);
     }return res;
    }
}