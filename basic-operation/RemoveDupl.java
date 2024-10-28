import java.util.ArrayList;

public class RemoveDupl {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
          boolean[] cnt= new boolean[1001];
        for(int i:arr) cnt[i]=true;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:arr){
            if(cnt[i]==true){
            res.add(i);
            cnt[i]=false;
            }
        }
        return res; 
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 5, 5, 7, 7};
        System.out.println(removeDuplicate(arr) ); 
    }
}
