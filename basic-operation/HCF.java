public class HCF {
    public static void main(String[] args) {
        int a=48 ,b=72;
        System.out.println(gcd( a,  b));
    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        while(a!=b){
            if(a<b){
              b=b-a;
            } 
            else{
                a=a-b;
            } 
        }
    return a;    
    }
}
