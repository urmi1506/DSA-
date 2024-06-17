package Recursion;

public class RevArr1 {
    // two pointer approach
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        solve(arr,0, n-1);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
    static void solve(int arr[],int i , int j){
        //base case
        if(i>=j)
        return;
        //swap
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        //Recursive call
        solve(arr,i+1, j-1);

    }
}
