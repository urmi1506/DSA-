import java.util.HashMap;

public class PairCnt {
    int getPairsCount(int[] arr, int n, int k) {
        // int cnt = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++)
        //         if (arr[i] + arr[j] == k) 
        //             cnt++;       
        // }
        // return cnt;
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
int cnt=0;
for(int i=0;i<n;i++){
    int num=arr[i];
    if(map.containsKey(k-num)){
        cnt+=map.get(k-num);
    }
    map.put(num,map.getOrDefault(num,0)+1);
}
 return cnt;



    }
}
//optimized sol

