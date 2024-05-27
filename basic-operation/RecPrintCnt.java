public class RecPrintCnt {
    public static void main(String[] args) {
        int n=5;
        System.out.println(n);
        count(n);
    }
    static void count(int n){
        if(n==0)
        return ;
        //tail recursion
        System.out.println(n);
        //op 5 4 3 2 1
        count(n-1);
        /*head recursion
          System.out.println(n);
          op=1 2 3 4 5
         */
    }
}
