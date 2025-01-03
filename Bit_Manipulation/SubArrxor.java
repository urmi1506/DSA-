package Bit_Manipulation;

import java.util.HashMap;

public class SubArrxor {
    public static long subarrayXor(int arr[], int k) {
        long n=arr.length;
        long xor=0;
        long cnt=0;
        HashMap<Long,Long>hm=new HashMap<>();
        hm.put(0L,1L);
        for(int i=0;i<n;i++){
            xor^=arr[i];
            long target=xor^k;
            cnt+=hm.getOrDefault(target,0L);
            hm.put(xor,hm.getOrDefault(xor,0L)+1L);
        }
        return cnt;
    }
    public static void main(String[] args) {
       int arr[] = {4, 2, 2, 6, 4};
       int k = 6;
       System.out.println(subarrayXor(arr,  k));
    }
}
