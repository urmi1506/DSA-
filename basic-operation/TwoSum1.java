import java.util.Arrays;

public class TwoSum1 {
     static boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            
            if(sum==target){
                return true;
            }else if(sum<target){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(twoSum(arr, target));
    }
}

