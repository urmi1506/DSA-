import java.util.ArrayList;
import java.util.Collections;

public class k_large {
    public static int kthLargest(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum +=arr[j];
                list.add(sum);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        return list.get(k-1);
        
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        int k = 2 ;
        System.out.println(kthLargest(arr, k));
    }
}
