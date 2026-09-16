class Solution {

    static boolean ship(int arr[],int days, int cap ){
        int day=1;
        int currw=0;
        for( int  weight : arr){
            if( currw + weight<= cap){
                currw= currw+ weight;
            }else{
                day ++;
                currw= weight;
            }
            if(day> days){
              return  false;

            }

        }return true;
       
    }
    public int shipWithinDays(int[] arr, int days) {

        int n= arr.length;
        int low=0;
        int high=0;
        for( int i : arr){
            low= Math.max(low,i);
            high= high+i;
        }
        int res= high;
        while(low<=high){
            int guess=low +(high -low)/2;
            if(ship(arr,days,guess)){
                res= guess;
                high=guess-1;
            }else{
                low= guess+1;
            }

        }return res;
        
    }
}