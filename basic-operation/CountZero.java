public class CountZero {
    public static void main(String[] args) {
        int n =5;
        int [] arr={1,1,1,0,0};
        System.out.println(countZeroes(arr, n) );
    }
    static int countZeroes(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

}
