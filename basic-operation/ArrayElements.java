import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        long n=5;
        long a[]={2, 8, 7, 1, 5};
        long res[]=(findElements(a,n));
        //print element of array
        for (long e : res) {
           System.out.println(e); 
        }
        

    }
    public static long[] findElements( long a[], long n)
    { //sort array in ascending order
      Arrays.sort(a);
      //array to store elements except the last two
      long res[] = new long[(int) (n - 2)];
      for (int i = 0; i < n-2; i++) {
        res[i]=a[i];
      }
    
    return res;
}
}
