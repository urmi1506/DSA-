package Hard;

public class MajorityEle {
    public static int majorityElement(int[]nums){
        int majority=0;
        int cnt=0;
        for (int num : nums) {
            if(cnt==0) majority=num;
            cnt += (num == majority)?1:-1;
        }
    return majority;
    }
    public static void main(String[] args) {
        int[]nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
