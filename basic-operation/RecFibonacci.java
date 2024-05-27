public class RecFibonacci {
    public static void main(String[] args) {
        int n=4;
        //print all no of fibbonacci series
        for (int i = 0; i < n; i++) {
            System.out.println(fibbonacci(i));
        }
        System.out.println();
        //only print nth no of fibbonacci series
        System.out.println(fibbonacci( n));
    }
    static int fibbonacci(int n){
        //its start from 0 and 1 so base case
        if(n==0 || n==1)
        return n;
        int fibbres1=fibbonacci(n-1);
        int fibbres2=fibbonacci(n-2);
        int ans =fibbres1+fibbres2;
        return ans;
    }
}
