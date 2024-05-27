public class ArrEvenOdd {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1 ,2 ,3 ,4 ,5 };
        countOddEven( arr,  n);
        
    }
    public static void countOddEven(int[] arr, int n)
    {   int evencount=0;
        int oddcount=0;
        for(int i=0; i< n; i++){
        if(arr[i]%2==0){
           evencount++;
        }
        else{
         oddcount++;
        } 
    }
    System.out.println(oddcount+" "+evencount);

}
}
