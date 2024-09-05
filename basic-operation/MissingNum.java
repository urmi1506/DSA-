public class MissingNum {
    public static int missingNumber(int[]arr ,int n){
        // cal sum of all integer
        int sumInt=n*(n+1)/2;

        int sumArr=0;
        for (int i = 0; i < arr.length; i++) {
            // cal sum of each element of arr
            sumArr+=arr[i];
        }
        int MissingNumb=sumInt-sumArr;
        return MissingNumb;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,5};
        System.out.println(missingNumber(arr ,n));
    }
}
