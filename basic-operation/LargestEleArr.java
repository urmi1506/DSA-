import java.util.ArrayList;
public class LargestEleArr {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1, 8, 7, 56, 90};
         
         ArrayList<Integer> arrayList = new ArrayList<>();
         for (int i : arr) {
             arrayList.add(i);
         }
 
         LargestEleArr e = new LargestEleArr();
         int largestElement = e.largest(arrayList, n);
         System.out.println("The largest element in the array is: " + largestElement);
    }
    
    int largest(ArrayList<Integer> arr, int n)
    {
        int max = arr.get(0); 
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) 
                max = arr.get(i);
        }
       
       return max;
    }
};

