public class CntPairs {
    static int countPairs(int arr[], int target) {
        int cnt=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
            int sum=arr[i]+arr[j];
            if(sum<target)cnt++;
        }
      }
      return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 3};
        int target = 8;
        System.out.println( countPairs(arr, target));
    }
}
