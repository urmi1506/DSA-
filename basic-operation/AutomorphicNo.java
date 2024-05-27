public class AutomorphicNo {
    public static void main(String[] args) {
      int n=76;
      System.out.println(is_AutomorphicNumber(n));   
    }
    public static String is_AutomorphicNumber(int n)
    {
       int sq=n*n;
       
        int rem=n%10;
        if(rem!=sq%10){
            return "Not Automorphic";
        }
        
       
       return "Automorphic";
      } 
    }


