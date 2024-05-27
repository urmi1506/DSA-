public class SayDigit {
    public static void main(String[] args) {
        int n = 412;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        CallDigit(n,arr);
    }

    static void CallDigit(int n ,String[] arr) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        n=n / 10;
        CallDigit(n,arr);
        System.out.println(arr[digit]);
    }
}
