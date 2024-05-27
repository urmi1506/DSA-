public class RecArrSum {
    public static void main(String[] args) {
        int n=4;
        int[]arr={1,2,3,4};
        System.out.println(arrsum( n-1,arr));
    }
    static int arrsum(int n,int []arr){
        if(n<0)
        return 0;
        return arr[n]+arrsum( n-1,arr);
    }
}
