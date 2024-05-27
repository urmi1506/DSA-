public class IntersectArr {
    public static void main(String[] args) {
        int n=5;
        int m= 3;
        int arr1[]= {1, 2 ,3 ,4 ,5};
        int arr2[]={ 1 ,2 ,3 }; 
        intersect_arr( arr1,  n, arr2,  m );
    }
    static void intersect_arr(int arr1[], int n,int arr2[], int m ) {
          for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " "); 
                    /*  not take System.out.print(arr1[j] + " "); 
                     it printing elements from the second array only  
                    */
                }
            }
          }
    }
}
