import java.util.ArrayList;
import java.util.HashSet;

class countDistinct{
static ArrayList<Integer> cntDistinct(int arr[], int k) {
    ArrayList<Integer> ans=new  ArrayList<Integer>();
     for(int i=0;i<=arr.length-k;i++){
         ans.add(find_distinct(i,i+k,arr));
     }
     return ans;
 }
   static int  find_distinct(int start,int end,int[] ar){
     HashSet<Integer> set=new HashSet<>();
     for(int i=start;i<end;i++) set.add(ar[i]);
     return set.size();
 }
 
 public static void main(String[] args) {
    int arr[] = {1, 2, 1, 3, 4, 2, 3};
    int k = 4 ;
    System.out.println(cntDistinct(arr, k));
 }
}