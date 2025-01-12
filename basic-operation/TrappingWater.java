public class TrappingWater {
    public static int maxWater(int arr[]) {
        int n=arr.length;
         int max=0;
         for(int i=0;i<n;i++)
         {
             if(arr[max]<arr[i])
             max=i;
         }
         int water=0;
         int left_max=0;
         for(int i=0;i<max;i++)
         {
             if(arr[i]>left_max)
             left_max=arr[i];
             
             water=water+(left_max-arr[i]);
         }
          int right_max=0;
         for(int i=n-1;i>max;i--)
         {
             if(arr[i]>right_max)
             right_max=arr[i];
             water=water+(right_max-arr[i]);
         }
         return water;
 
     }
     public static void main(String[] args) {
        int arr[] = {3, 0, 1, 0, 4, 0 ,2};
        System.out.println(maxWater(arr));
     }
}
