public class RecArrSortOrNot {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 5, 6, 12, 45 };
              boolean ans=isarrsort(n,arr);
            System.out.println(ans);
        
    }

    static boolean isarrsort(int n, int[] arr) {
        if (n == arr.length - 1)
            return true;
        boolean sortRes = isarrsort(n + 1, arr);
        boolean ans = sortRes && arr[n] <= arr[n + 1];
        return ans;
    }

}
