package Recursion;

public class Pow {
    public static void main(String[] args) {
        double x=2.00000;
        int n=10;
        System.out.println(myPow( x,  n));
    }
        public static double myPow(double x, int n) {
            return binary(x, (long) n);
        }
    
        private static double binary(double x, long n) {
            if (n == 0) {
                return 1;
            }
           
            if (n < 0) {
                return 1.0 / binary(x, -n);
            }
           
            if (n % 2 == 1) {
                return x * binary(x * x, (n - 1) / 2);
            } else {
                return binary(x * x, n / 2);
            }
        }
    }
       

