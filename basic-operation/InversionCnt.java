public class InversionCnt {
    //without merge sort 
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,20,6,4,5};
        System.out.println(count(arr, n));

    }
    static int count(int arr[],int n){
        int inv_cnt=0;
        for (int i = 0; i < n-1; i++) 
            for (int j = i+1; j < n; j++) 
                if(arr[i]>arr[j])
                inv_cnt++;
            
    return inv_cnt;    
    }
}
