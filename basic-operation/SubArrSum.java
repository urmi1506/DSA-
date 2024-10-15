import java.util.HashMap;

public class SubArrSum {
     static int subArraySum(int arr[], int tar) {
         HashMap<Integer,Integer>hm = new HashMap<>();
        int sum = 0;
        int res = 0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(hm.containsKey(sum-tar)){
                res = res + hm.get(sum-tar);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10} ;
        int tar = -10;
        System.out.println(subArraySum(arr, tar));
    }
}
