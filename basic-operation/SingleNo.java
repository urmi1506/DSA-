public class SingleNo {
    static int getSingle(int arr[]) {
        int res=0;
      for(int i=0; i<arr.length; i++){
          res ^=arr[i];
          
      }
      return res;
  }
  public static void main(String[] args) {
    int arr[] = {1, 1, 2, 2, 2};
    System.out.println(getSingle(arr));
  }
}
