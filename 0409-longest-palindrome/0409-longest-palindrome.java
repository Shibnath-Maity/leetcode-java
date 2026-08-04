class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        int count[]= new int[128];
        for( char c: s.toCharArray()){
         count[c]++;
        }
        for( int i=0;i<128;i++){
            if(count[i] % 2 ==0){
                res = res + count[i];
             
            }else{
                res = res + count[i] -1;
            }
            }if(res <s.length()){
                res++;
        }return res;
    }
}