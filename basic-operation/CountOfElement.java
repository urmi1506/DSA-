public class CountOfElement {
    public static void main(String[] args) {
        int n=6;
        int arr[]={1, 2, 4, 5, 8, 10};
        int x=9;
        System.out.println(countOfElements(arr,n,x));  
    }
    public static int countOfElements(int arr[], int n, int x)
    {   int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=x){
              count++;
            }
        }
        return count;
    }
}
