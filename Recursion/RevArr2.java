package Recursion;

public class RevArr2 {
    //One pointer Approach
    public static void main(String[] args) {
        int n=5;
        int []arr={1,2,3,4,5};
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        solve(arr,0, n);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
       
    }
    static void solve(int arr[],int i,int n){
        //base case
        if(i >= n/2)
        return;
        //Swap
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        //Recursive Call
        solve(arr, i+1, n);
    }
}
