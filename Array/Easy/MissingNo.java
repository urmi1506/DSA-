package Easy;

public class MissingNo {
    public static int missingNo(int nums[]){
        // we find missing val that y require + 1 in size
        int n = nums.length + 1; 
        
        // we start from 1 bcz its identify missing val from 1 ...atlast possible of nums = [0,0]
        for (int i = 1; i < n; i++) {
            boolean found = false;
        // check the number present or not
            for (int j = 0; j < n-1; j++) {
                if(nums[j] == i) found = true;
            }
        // not found then written missing no
            if(!found) return i;
            
        }
    return -1;
    }
    public static void main(String[] args) {
        int nums[] ={3,0,1};
        System.out.println(missingNo(nums));
        
    }
}
