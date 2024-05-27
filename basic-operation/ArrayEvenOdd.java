import java.util.ArrayList;

public class ArrayEvenOdd {
 public static void main(String[] args) {
    int N=5;
    int Arr[]={1,2,3,4,5};    
    ArrayList<Integer> res=( EvenOddSum(N,Arr));
    for (int e : res) {
        System.out.println(e); 
     }
 }   
    static ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
    ArrayList<Integer> list = new ArrayList<>();
    int evenSum = 0;
    int oddSum = 0;
    for(int i=0; i<N; i++){
        
        if(i%2 == 0){
            evenSum += Arr[i];
        }else{
            oddSum += Arr[i];
        }
    }
    
    
    list.add(evenSum);
    list.add(oddSum);
    
    return list;


        
    }
}
