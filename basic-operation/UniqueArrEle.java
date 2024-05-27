public class UniqueArrEle {
    public static void main(String[] args) {
        int size= 5;
        int arr[]={2,3,2,3,1};
        int result=(findUnique (arr , size));
        System.out.println(result);
    }
     static int findUnique (int []arr , int size){
        int res=0;
        for (int i = 0; i < size; i++) {
            res=res^arr[i];
        }
        return res;
    }
}
