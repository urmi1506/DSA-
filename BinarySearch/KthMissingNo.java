package BinarySearch;

public class KthMissingNo {
    public static int findKmissingNo(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            // missing no before mid
            int missing =arr[mid]-(mid+1);
            if(missing < k) low=mid+1;
            else high=mid-1;
        }
        return low+k;
    }
    public static void main(String[] args) {
        int []arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKmissingNo(arr, k));
    }
}
