import java.util.ArrayList;
import java.util.Arrays;

public class SubsetOfArr {
    public static void main(String[] args) {
        long n= 8;
        long a1[]={11, 7, 1, 13, 21, 3, 7, 3};
        long m=5 ;
        long a2[]={11, 3, 7, 1, 7};
        System.out.println(isSubset(  a1,  a2,  n,  m));
    }
    public static String isSubset( long a1[], long a2[], long n, long m) {
Arrays.sort(a1);
        Arrays.sort(a2);
        n=a1.length;
        m=a2.length;
        ArrayList<Long> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(a1[i]);
        }
        for(int i=0;i<m;i++)
        {
            if(l.contains(a2[i]))
            {
                l.remove(a2[i]);
            }
            else
            {
                return "No";
            }
        }
        return "Yes";
        
    }
}
