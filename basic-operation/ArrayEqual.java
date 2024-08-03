import java.util.Arrays;

public class ArrayEqual {
    public static boolean canBeEqual(int[] target, int[] arr) {
        // sort both array
        Arrays.sort(arr);
        Arrays.sort(target);
        // compare both array
        return Arrays.equals(target, arr);
    }
    public static void main(String[] args) {
       int []target = {1,2,3,4};
       int []arr = {2,4,1,3};
       System.out.println(canBeEqual( target,arr));
    }
}
