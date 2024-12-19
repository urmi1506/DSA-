public class MaxChunks {
        public static int maxChunksToSorted(int[] arr) {
            int n=arr.length;
            if (arr == null || n == 0)  return 0;
    
            int cnt = 0, maxi = 0;
            for (int i = 0; i < n; i++) {
                maxi = Math.max(maxi, arr[i]);
                
                if (maxi == i) cnt++;
            }
    
            return cnt;
        }
    public static void main(String[] args) {
        int[]arr = {4,3,2,1,0};
        System.out.println(maxChunksToSorted(arr));
    }
}
