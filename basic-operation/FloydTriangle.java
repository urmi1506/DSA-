public class FloydTriangle {
    public static void main(String[] args) {
       int N=5;
        printFloydTriangle(N); 
    }
    
    static void printFloydTriangle(int N) {
        int i, j, k = 1;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
// Floyd’s triangle is a triangle with first natural numbers. It is the right arrangement of the numbers/values or patterns. Basically, it is a left to right arrangement of natural numbers in a right-angled triangle