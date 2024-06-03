public class ProdOfArrEle {
    public static void main(String[] args) {
        int n = 4;
        long mod = 1000000007; 
        Long arr[] = {1L, 2L, 3L, 4L};
        System.out.println(product(arr, mod, n));
    }

    public static long product(Long arr[], long mod, int n) {
        long prod = 1;

        for (int i = 0; i < n; i++) {
            prod = (prod * arr[i]) % mod;
        }

        return prod;
    }
}
