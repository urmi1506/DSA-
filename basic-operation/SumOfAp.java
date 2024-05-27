public class SumOfAp{
    public static void main(String args[]){
      int n=5;
      int a=1;
      int d=3;
      System.out.println(sum_of_ap(n, a,d));
    }
    public static int sum_of_ap(int n, int a, int d)
    {   /*whn u take n/2 *(2*a+(n-1)*d) it give error bcz in some cases n/2 give ans in float & get lossy coversation like int to float or double therefore we write formula like below*/  
      return  n*(2*a+(n-1)*d)/2; 
    }

}