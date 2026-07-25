class Solution {
    public int maxProduct(int n) {
       int res;
       int largest=0;
       int secondlargest=0;
      while(n>0){
        int digit= n%10;
        if(digit>largest){
            secondlargest= largest;
            largest=digit;
        }else if(digit > secondlargest){
            secondlargest=digit;
        }
        n=n/10;
      }return res = largest * secondlargest;
}
}