public class SearchArrEle {
    public static void main(String[] args) {
        int n=5;
       int arr[]={5,7,11,1,2}; 
       int key=1;
       System.out.println(search(arr ,  n , key));
 
    }
    static int search(int arr[], int n, int key)
    {
        
        for (int i = 0; i < n; i++) {
            if(arr[i]==key)
            return i;
        }
        return -1;
        
    }

}
