//very very imp que print wave form of arr
public class SineWaveEx {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        int nRows = 2;
        int mCols = 2;
        // System.out.println(wavePrint(arr, nRows, mCols)); 

        int[] wave = wavePrint(arr, nRows, mCols);
        for (int i = 0; i < wave.length; i++) {
            System.out.print(wave[i] + " ");
        }
    }

    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        int[] res = new int[nRows * mCols];
        int index = 0; 
        for (int col = 0; col < mCols; col++) {
            if (col % 2 != 0) {  //if ((col & 1) != 0) we can use this also
                for (int row = nRows - 1; row >= 0; row--) {
                    res[index++] = arr[row][col];
                }
            } else {
                for (int row = 0; row < nRows; row++) {
                    res[index++] = arr[row][col];
                }
            }
        }
        return res;
    }
}
