import java.util.HashSet;


public class UnionArr {
    public static void main(String[] args) {
        int n=5;
        int m= 3;
        int a[]= {1, 2 ,3 ,4 ,5};
        int b[]={ 1 ,2 ,3 };
        System.out.println(doUnion( a,  n,  b,  m) );
    }
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> union = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            union.add(a[i]);
        }
        for(int i = 0 ; i < m ; i++){
            union.add(b[i]);
        }
        return union.size();
    }
}
