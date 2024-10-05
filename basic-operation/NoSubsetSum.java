public class NoSubsetSum {
    public static int findSmallest(int[] arr){
        int res=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>res)return res;
            else res+=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(findSmallest(arr));
    }
}
