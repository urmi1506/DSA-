public class DiceProblem {
    public static void main(String[] args) {
      int N=1;
      System.out.println(oppositeFaceOfDice( N));  
    }
    static int oppositeFaceOfDice(int N){
        int ans=7-N;
        return ans;
    }
}
