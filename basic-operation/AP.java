public class AP {
    public static void main(String[] args) {
        int A1=2;
        int A2=3;
        int N=4;
        int ans= nthTermOfAP( A1,  A2,  N) ;
        System.out.println(ans);
    }
    static int nthTermOfAP(int A1, int A2, int N) {
        return A1+(N-1)*(A2-A1);
}
}
