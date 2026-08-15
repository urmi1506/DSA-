package Hard;

public class MajorityEle {
    public static int majorityElement(int[]nums){
        int n = nums.length;
        
        // Find majority 
        int majority = 0;
        int cnt =0;
        for(int num : nums){
            if(cnt == 0){
                majority =num;
            }
            if(num == majority){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        // verify majority element 
        cnt =0;
        for(int num : nums){
            if(num == majority){
                cnt ++;
            }
        }
        if(cnt > n/2){
            return majority;
        }
    return -1;
    }
    public static void main(String[] args) {
        int[]nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
