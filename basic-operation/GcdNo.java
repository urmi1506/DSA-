public class GcdNo {
    public static void main(String[] args) {
        int A =3;
        int B= 6; 
        
        System.out.println(gcd(A ,B));
    }
    public static int gcd(int A , int B) 
    {   if(B==0){
        return A;
    }
    else{
    return gcd(B,A%B);
    
    } 
}
}
