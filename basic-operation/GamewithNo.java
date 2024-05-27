public class GamewithNo {
    public static void main(String[] args) {
        int n=5  ;
        int arr[]={10, 11, 1, 2, 3};
        System.out.println(game_with_number (arr,  n));
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] game_with_number (int arr[], int n) {
        for(int i=0; i<n-1; i++)
        arr[i]= arr[i] ^ arr[i+1];
        return arr;
    }
}
