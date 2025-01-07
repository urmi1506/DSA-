public class PairSum {
    static int countPairs(int arr[], int target) {
        int n=arr.length;
        int cnt=0;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]== target){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {-1, 1, 5, 5, 7};
        int target = 6 ;
        System.out.println(countPairs(arr, target));
    }

}
