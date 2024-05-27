public class PivotEle {
    public static int findPivot(int[] arr , int n) {
        /*whn we find  pivot element
         .rotated array
         .sorted array
         .both 
         .etc
        */
        // Find smallest element (pivot-element)
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[high]) {
                
                low = mid + 1;
            } else {
                // we can't take high=mid+1 bcz if pivot element it found at mid den it skip pivot element
                high = mid;
            }
        }

        // we can use arr[high] also bcz during iteration we update both high & low nd it reach sm pt
        return arr[low];
    }

    public static void main(String[] args) {
        int n=6;
        int[] arr = {4, 5, 6, 7,  1, 2};
        int pivotElement = findPivot(arr,n);
        System.out.println("The pivot element is: " + pivotElement);
    }
}


