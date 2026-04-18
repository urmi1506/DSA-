package Basic;

public class MirrorDist {
    public static int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
    private static int reverse(int n){
        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = (rev * 10) + digit ;
            n /= 10;
        }
    return rev;
    }
    public static void main(String[] args) {
        int n = 25;
        int mirror_dist = mirrorDistance(n);
        System.out.println(mirror_dist);
    }
}
