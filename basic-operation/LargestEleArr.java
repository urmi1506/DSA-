import java.util.ArrayList;
import java.util.Vector;
public class LargestEleArr {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1, 8, 7, 56, 90};
        
    }
    
    int largest(ArrayList<Integer> arr, int n)
    {
        int max= arr[0];
       for (int i = 1; i < n; i++) {
                if(arr[i]>max)
                max=arr[i];
                
       }
       
       return max;
    }
};

