public class MostWater {
    public static int maxWater(int arr[]) {
        if (arr == null || arr.length < 2) {
		return 0;
	}
 
	int max = 0;
	int left = 0;
	int right = arr.length - 1;
 
	while (left < right) {
		max = Math.max(max, (right - left) * Math.min(arr[left], arr[right]));
		if (arr[left] < arr[right])
			left++;
		else
			right--;
	}
 
	return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 3};
        System.out.println(maxWater(arr));
    }
}
