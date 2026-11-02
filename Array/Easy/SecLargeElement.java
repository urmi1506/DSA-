package Easy;

public class SecLargeElement {
    public static int secondLargestElement(int[] arr){
        // consider 1 & 2 largest as minimum
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num: arr) {
            if(num > largest){
            // old Largest become sec Largest
                second = largest;
            // new Largest assign to largest
                largest = num ;
            }
            // Tc : 10 5 20
            else if (num > second && num != largest) second = num;
        }
        // TC : 10 10  10 --> -1
    return (second == Integer.MIN_VALUE) ? -1 : second ;

    }
    public static void main(String[] args) {
        int []arr={3,3,6,5};
        System.out.println(secondLargestElement(arr));
    }
}
