public class IndexOf1 {
    public static void main(String[] args) {
        long n=9;
        long arr[]={0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(firstIndex( arr,  n));
    }
    public static long firstIndex(long arr[], long n)
    {

      
       for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                return i;
            }

       }
      return -1; 
    }
}
