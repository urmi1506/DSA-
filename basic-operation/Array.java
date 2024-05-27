import java.util.ArrayList;

public class Array{
    
   static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
    ArrayList<Integer> Arr = new ArrayList<>();
    

    for(int i=0;i<arr.length;i++){
        if(i+1==arr[i]){
            Arr.add(i+1);
        }
}
return Arr;
}
public static void main(String[] args) {
    // Sample array
    int[] arr = {15, 2, 45, 12, 7};

    // Call the method to find elements with values equal to their indices
    ArrayList<Integer> result = valueEqualToIndex(arr, 0);
     
    // Print the result
    System.out.println("Elements with value equal to their index:");
     
     for (int value : result) {
         System.out.println(value);
    }
}
public static void sort(int[] v) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sort'");
}
}
