
    
    class Pair  
    {  
        long min, max;  
        public Pair(long min, long max)  
        {  
            this.min = min;  
            this.max= max;  
        }  
    } 
    class Solution {
        static Pair getMinMax(long a[], long n) {
          
            
            
           
               long min = a[0];
                long max= a[0];
    
                for (int i = 1; i < n; i++) {
                    if (a[i] > max) {
                        max = a[i];
                    } else if (a[i] < min) {
                        min = a[i];
                    }
                }
            
    
            return new Pair(min ,max);
        }
        public static void main(String[] args) {
          long  n = 6;
          long a[] = {3, 2, 1, 56, 10000, 167};
          Pair result = getMinMax(a, n);

    System.out.println("Min: " + result.min);
    System.out.println("Max: " + result.max);
          //System.out.println(getMinMax( a,  n));

        }
    }

