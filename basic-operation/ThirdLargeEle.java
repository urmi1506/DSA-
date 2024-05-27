import java.util.Arrays;
public class ThirdLargeEle {
    public static void main(String[] args) {
        int n=2;
        int a[]={2,5};
        System.out.println(thirdLargest(a,  n));
    }
    static int thirdLargest(int a[], int n)
    {
        if(n<3) //array size less than 3 so no third largest element found
        return -1;
	    Arrays.sort(a);
        return a[n-3];//array is 0 index so we written a[n-3] for third largest element
       
        
    }
}
