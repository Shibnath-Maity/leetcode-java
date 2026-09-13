class Solution {

    static long koko(int[] piles, int n, int speed){
        long h=0;
        
        for(int i=0;i<n;i++){
            h=h+piles[i]/speed;
            if(piles[i]%speed !=0){
                h++;
            }
        }return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        int res=-1;
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        while(low<=high){
            int guess=(low+high)/2;
            long hour=koko(piles,n,guess);
            if(hour>h){
                low= guess+1;
            }else{ res= guess;
            high=guess-1;}
        }
     return res;   
    }
}