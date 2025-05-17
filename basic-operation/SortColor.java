import java.util.Arrays;

public class SortColor {
    public static void sortcolour(int[] nums){
        Arrays.sort(nums);
    }
    public static void main(String[] args) {
        int[] nums ={ 2,0,2,1,1,0};
        sortcolour(nums);
        System.out.println(Arrays.toString(nums));
    }
}
