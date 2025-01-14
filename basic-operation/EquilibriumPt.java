public class EquilibriumPt {
    public static int findEquilibrium(int arr[]) {
        int totalSum=0,leftSum=0;
      for(int i=0;i<arr.length;i++) totalSum+=arr[i];
      
      for(int i=0;i<arr.length;i++){
          int rightSum=totalSum-leftSum-arr[i];
          if(leftSum==rightSum) return i;
          leftSum+=arr[i];
      }
      return -1;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 0, 3};
    System.out.println(findEquilibrium(arr) );
  }
}
