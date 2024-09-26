public class RoofTop {
    public static int maxStep(int arr[]) {
        int curr=0;
        int max=0;
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i]<arr[i+1])
           {
               curr++;
           }
           else
           {
               curr=0;
           }
           max=Math.max(max,curr);
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 2};
        System.out.println(maxStep(arr));
    }
}
