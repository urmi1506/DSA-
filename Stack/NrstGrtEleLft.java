package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NrstGrtEleLft {
    public static long[] greatestele(long[] arr,int n){
        ArrayList <Long> list=new ArrayList<>();
        Stack <Long> s=new Stack<>();
        for(int i=n-1; i>=0; i--){
           while(!s.isEmpty() && s.peek()<=arr[i]){
            //stack is empty
            if(s.empty()){
                list.add(-1L);
            }
            //if not empty den add stack top element
            else{
                list.add(s.peek());
            }
            //push array element in stack
            s.push(arr[i]);
           }
        }
        //maintain correct order
        Collections.reverse(list);
        
        //convert arraylist to array
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
