class Solution {
    public boolean checkDivisibility(int n) {
        int prevn=n;
        int plus=0;
        int mul=1;
        while(n>0){
           int dig= n%10;
           plus += dig;
           mul = mul *dig;
            n=n/10;

        }
       int sum= plus+mul;
       if(prevn % sum ==0){
        return true;
       }else{
        return false;
       }

        
    }
}