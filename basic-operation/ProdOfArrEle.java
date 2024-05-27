public class ProdOfArrEle {
    public static void main(String[] args) {
        int n= 4;
        Long mod= 1;
        Long arr[]= {1 ,2 ,3 ,4} ;
        System.out.println(product( arr, mod,  n));
    }
    public static Long product(Long arr[], Long mod, int n)
    {
        long prod = 1;

        for (int i = 0; i < n; i++) {

            prod = (prod * arr[i])%mod;

        }

        

        return prod;
    }
}
