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
<<<<<<< HEAD
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
int cnt=0;
for(int i=0;i<n;i++){
    int num=arr[i];
    if(map.containsKey(k-num)){
=======
//optimized sol
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int cnt=0;
        for(int i=0;i<n;i++){
        int num=arr[i];
        if(map.containsKey(k-num)){
>>>>>>> 14b520927b4df1007d36b0e4455eaff839c16be4
        cnt+=map.get(k-num);
     }
         map.put(num,map.getOrDefault(num,0)+1);
      }
       return cnt;

    }
}



    }
}
//optimized sol

