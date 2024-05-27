public class SmallerLarger {
    public static void main(String args[]){
        int n=7;
        int[] arr={1, 2, 8, 10, 11, 12, 19};
        int x=0;
        System.out.println(getMoreAndLess(arr,n,x)); 
    }
    static int[] getMoreAndLess(int[] arr, int n, int x) {
     // Initializing an array to store the counts of elements smaller and larger than x
     // Take 2 for 1. for store small element 2.for store large element    
        int[] arr2 = new int[2];
        int count1=0;
        int count2=0;
        
        for(int i=0; i<n; i++){
            if(arr[i]<=x) {
                count1++;
            }
            if(arr[i]>=x){
                 count2++;
            }
        
    }
         // Store the counts in the result array
        arr2[0]=count1;
        System.out.println(arr2[0]);
        arr2[1]=count2;
        System.out.println(arr2[1]);
        return arr2;

}
}
