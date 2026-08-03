class Solution {
    public int firstUniqChar(String s) {
        
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap();
        int i=0;

    for(char c: s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }for(i=0;i<n;i++){
        if(map.get(s.charAt(i))==1){
            return i;
        }
    }
return -1;
    }
}