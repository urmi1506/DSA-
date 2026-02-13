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

            else if (num > second && num != largest) second = num;

        }
    return (second == Integer.MIN_VALUE) ? -1 : second ;

    }
}
