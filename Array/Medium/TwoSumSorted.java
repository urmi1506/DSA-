package Medium;

public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length - 1;

        while(left < right ){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                // As given 1 base idx
                return new int[]{left +1 ,right+1};
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
    return new int[]{};
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] Result = twoSum(numbers, target);
        for (int i : Result) {
            System.out.println(i);
        }
    }
}
