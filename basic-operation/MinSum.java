public class MinSum {
    public static long minsum (int[] num1 , int[] num2){
    //  initialize zero count
    int num1zeroes = 0 ;
    int num2zeroes = 0 ;

    // initialized sum of both arr to 0
    int sum1 = 0 ;
    int sum2 = 0 ;

    // iterate arr 1
    for ( int i : num1){
        if (i == 0) num1zeroes ++ ;
        sum1 += i ;
    }

     // iterate arr 2
     for ( int i : num2){
        if (i == 0) num1zeroes ++ ;
        sum2 += i ;
    }
    
    //   find min
    int min1 = sum1 + num1zeroes ;
    int min2 = sum2 + num2zeroes ;

    // all logic
    if (num1zeroes == 0 && num2zeroes == 0) return sum1 == sum2 ? sum1 : -1 ;
    else if (num1zeroes == 0) return sum2 + num2zeroes <= sum1 ? sum1 : -1;
    else if (num2zeroes == 0) return sum1 + num1zeroes <= sum2 ? sum2 : -1;

    return Math.max(min1, min2);
    }

    public static void main(String[] args) {
        int num1[] = {3,2,0,1,0};
        int num2[] = {6,5,0};
        System.out.println(minsum (num1 , num2));
    }
}
