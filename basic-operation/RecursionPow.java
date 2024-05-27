public class RecursionPow {
   public static void main(String[] args) {
    int n=3;
    int ans=power(n);
    System.out.println(ans);
   } 
   static int power(int n){
    //base case
    if(n==0)
    return 1;
    int smallProblem=power(n-1);
    int biggProblem=2*smallProblem;
    return biggProblem;
   }
}
