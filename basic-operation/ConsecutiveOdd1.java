public class ConsecutiveOdd1 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for(int i = 0 ; i < n ; i++ ){
            if (arr [i] % 2 !=0) cnt ++;
            else cnt = 0;
            if(cnt == 3) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
