public class MidoriAndChoc {
    public static void main(String[] args) {
        int i=2;
        int L=3;
        System.out.println(leftShops( i,  L));
    }
    static long leftShops(long i, long L){
      // Calculate  total number of shops  using 2^L
      long totalShops = (long) Math.pow(2, L);

      // Calculate the number of shops to the left by subtracting the current position (i) from the total
      long leftShops = totalShops - i;

      // Return the result
      return leftShops;
}
}
