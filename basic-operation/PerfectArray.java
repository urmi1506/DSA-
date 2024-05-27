public class PerfectArray {
    public static void main(String[] args) {
        int n=5;
        int a[]={1, 2, 3, 2, 1};
        System.out.println(IsPerfect( a,  n));
    }
    public static boolean IsPerfect(int a[], int n) {
        for (int i = 0; i < n/2; i++) {
        
        
   /*  for ( j = n-1; j>0; j--) { //reverse arary logic
            System.out.println(a[j]+" ");
          } */
          
          if(a[i]!=a[n-i-1]){
          return false; //in case of boolean u can only return true or false or 0 & 1
          } 
    }
    return true;
}
}