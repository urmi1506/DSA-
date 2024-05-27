import java.util.ArrayList;
import java.util.* ;
import java.io.*; 

public class IntersectionOfSortArr {
    public static void main(String[] args) {
       int n = 6 ;
       ArrayList<Integer> arr1 = new ArrayList<>(); 
       arr1.add(1);  
       arr1.add(2);   
       arr1.add(2);   
       arr1.add(2);   
       arr1.add(3);   
       arr1.add(4);           
    //    1 2 2 2 3 4
    //    2 2 3 3
       int m = 4 ;
       ArrayList<Integer> arr2 = new ArrayList<>(); 
       arr1.add(2);  
       arr1.add(2);   
       arr1.add(3);   
       arr1.add(3); 
       //int result=findArrayIntersection( arr1, n, arr2,  m);
       ArrayList<Integer> result = findArrayIntersection(arr1, n, arr2, m);
       
       for (int element : result) {
           System.out.println(element );
    }
}
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> res=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ele = arr1.get(i);
        for (int j = 0; j < m; j++) {
            if(ele==arr2.get(j)){
               //res.push_back(ele);
               res.add(ele);
               //arr2.get(j)=-1;
               arr2.set(j, -1);
               break;
            }
        }
        }
        return res;
	}
}
