public class LinearSearch {
    public static void main(String[] args) {
       int n=5;
       int arr[]={5,7,11,1,2}; 
       int key=1;
       System.out.println(search(arr ,  n , key));

    }
   static boolean search(int arr[] , int n , int key){
    //    search 1 present in array or not
        for (int i = 0; i < n; i++) {
            if(arr[i]==key)
            return true;
        }
        return false;
    }
}
