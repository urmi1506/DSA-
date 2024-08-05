package String;

public class DistinctCnt {
    public static String kthDistinctCnt(String []arr,int k){
        //Count of distict no
        int distinctCnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(isDistinct(arr, i)){
                distinctCnt++;
            }
            if(distinctCnt==k){
                return arr[i];
            }
        }
    return "";
    }
    private static boolean isDistinct(String []arr, int ind){
        //traverse string
        for (int i = 0; i < arr.length; i++) {
            //Find Distinct or not by comparing current str with remaining
            if(i != ind && arr[i].equals(arr[ind])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "b", "d", "e"};
        int k = 2;
        System.out.println(kthDistinctCnt(arr,k));

    }
}
