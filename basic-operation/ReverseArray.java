public class ReverseArray {
    public static void main(String[] args) {
        int n=5;
        int arr[]={11,55,9,29,35};
       reversearr( arr, n);
       for (int i = 0; i < n; i++) {
           System.out.println(arr[i]);
       }
    }
static void reversearr(int arr[],int n){
         int start=0;
         int end=n-1;
         for (int i = 0; i < n; i++) {
            while(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
         }
         
}
}
