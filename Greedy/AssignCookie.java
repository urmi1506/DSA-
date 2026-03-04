package Greedy;

import java.util.Arrays;

public class AssignCookie {
    public static int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;

        // initialized ptr
        int l =  0;
        int r =0;

        // sort both
        Arrays.sort(g);
        Arrays.sort(s);

        //Traverse
        while(l < m && r < n){
            if(g[r] <= s[l]) r = r+1;
            l=l+1 ;
        }

    return r;
    }
    public static void main(String[] args) {
        int[] g ={1,2,3 };
        int[] s ={1,1 };
        
        int res = findContentChildren(g, s);
        System.out.println(res);

    }
}
