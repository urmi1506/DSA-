public class ImmediateSmallEle {
    public static void main(String[] args) {
      int n= 5;
      int arr[]={4,2,1,5,3};  
      immediateSmaller( arr,  n); 

    }
    static void immediateSmaller(int arr[], int n) {
      for (int i = 0; i < n; i++) {
       if( i != n-1&& arr[i+1]<arr[i] ){
        // i++;
        arr[i]=arr[i+1];
       } 
      else{
         arr[i]=-1;
      }
    }
}
}
