public class RecBinaryInd {
  
        public static void main(String[] args) {
            int n=5;
            int []arr={21,23,72,74,77};
            int low=0;
            int high=n-1;
            int key=74;
            int ans=binarysearch(arr, low , high, key);
            System.out.println(ans);
        }
        static void print(int []arr,int low ,int high){
            for (int i = low; i<= high; i++) {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
        static int binarysearch(int []arr,int low,int high,int key){
            print(arr,low,high);
            
              //base case
              if(low>high){
                return -1;
              }
              int mid=low+(high-low)/2;
              System.out.println("mid is :"+arr[mid]);
    
              if(arr[mid]==key){
                return mid;
              }
              //recursive function
              if(arr[mid]<key){
                return binarysearch(arr,mid+1 , high, key);
                 
              }
              else{
                return  binarysearch(arr,low , mid-1, key);
                  
              }
        }
    }
    

