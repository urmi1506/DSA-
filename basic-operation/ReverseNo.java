public class ReverseNo {
    public static void main(String[] args) {
        long n=122;
         long reversedno =reverse_digit(n);
         System.out.println(reversedno);

    }
    public static long reverse_digit(long n)
    {
       long digit;
       long ans=0;
       while(n!=0){//if u don't take while loop nd this cond den it will print only last digit of reversed no
       digit=n%10;
       ans=(ans*10)+digit;
           n =n/10;
       }
    return ans;
    }

    
}
