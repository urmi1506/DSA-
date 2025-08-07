package BinarySearch;

public class KokoEatBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findMax(piles);
        while(low <= high){
            int mid = low+(high-low)/2;
            int totalH=calTotalHour(piles ,mid);
            if(totalH <= h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int findMax(int[] piles){
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi=Math.max(piles[i],maxi);
        }
        return maxi;
    }
    private static int calTotalHour(int []piles , int hourly){
        int n= piles.length;
        int totalH=0;
        for(int i=0;i<n; i++){
            totalH += Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalH;
    }
    public static void main(String[] args) {
        int []piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles, h));
    }


}
