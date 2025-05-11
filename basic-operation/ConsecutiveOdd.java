public class ConsecutiveOdd {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++ ){
            for( int j = i+1 ; j < n ; j++){
                for(int k = j+1 ; k < n ; k++){
                    if(arr[i] %2 != 0 && arr[j] % 2 !=0 && arr[k] % 2 !=0) return true;
                  
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
