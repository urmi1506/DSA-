public class KeleSpiWave {
    public static void main(String[] args) {
        int n = 4, m = 4, k = 10;
int A[][] = {{1 , 2 , 3 , 4},
         {5 , 6 , 7 , 8},
         {9 , 10 ,11 ,12},
         {13 , 14, 15 ,16}};
         System.out.println(findK( A,  n,  m,  k));
        
    }
    
    static int findK(int A[][], int n, int m, int k)
    {
	
        int ans=-1 ;
        if (A == null || A.length == 0) return ans;

       

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = n - 1;
        int endingCol = m - 1;

        int count = 0;
        int total = n * m;

        while (count < total) {
            // Traverse top row from left to right
            for (int i = startingCol; i <= endingCol && count < total; i++) {
                //  && count < total req otherwise it print repeating no
                count++;
                if(count==k){
                    ans=(A[startingRow][i]);
                    return ans;
                }
            }
            startingRow++;

            // Traverse right column from top to bottom
            for (int i = startingRow; i <= endingRow && count < total; i++) {
                count++;
                if(count==k){
                    ans=(A[i][endingCol]);
                    return ans;

                }
            }
            endingCol--;

            // Traverse bottom row from right to left
            for (int i = endingCol; i >= startingCol && count < total; i--) {
                count++;
                if(count==k){
                    ans=(A[endingRow][i]);  
                    return ans;

                }
            }
            endingRow--;

            // Traverse left column from bottom to top
            for (int i = endingRow; i >= startingRow && count < total; i--) {
                count++;
                if(count==k){
                    ans=(A[i][startingCol]);
                    return ans;


                }
            }
            startingCol++;
             
        }
        return ans;
    



    }
}


