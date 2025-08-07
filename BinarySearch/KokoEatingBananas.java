package BinarySearch;
public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxi=findMax(piles);
        for(int i=1 ; i<maxi; i++){
            int reqTime=calTotalHour(piles,i);
            if(reqTime <= h) return i;
        }
        return maxi;
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
