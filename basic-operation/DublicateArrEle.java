import java.util.ArrayList;

public class DublicateArrEle {
    public static void main(String[] args) {
        //int arr[]={4 ,2 ,1 ,3 1};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        //int result =findDuplicate(ArrayList<Integer> arr);
        int result =findDuplicate( arr);
        System.out.println(result);
    }
    public static int findDuplicate(ArrayList<Integer> arr) {
        // XOR ing all elements of array
		int res=0;
        for (int i = 0; i < arr.size(); i++) {
            res=res^arr.get (i);  //arr[i] not use in vector
        }
        // XOR ing [1 to n-1] elements of array
        for (int i = 1; i < arr.size(); i++) {
            res=res^i;
        }
        return res;
	}
}
