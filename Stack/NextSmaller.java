import java.util.Stack;

public class NextSmaller {
    public static int[] nextSmallerElements(int[] arr) {
        int n= arr.length;
        int nextsmaller[]=new int[1001];
        Stack<Integer>st=new Stack<>();
        //pop all greater elements
        for(int i =n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            nextsmaller[arr[i]]=st.isEmpty() ? -1 : st.peek();
            // push elements in arr bcz it could be nextsmaller of other
            st.push(arr[i]);

        }
        // copy ans in original arr
        for(int i=0; i< n; i++){
            arr[i]=nextsmaller[arr[i]];

        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={4, 8, 5, 2, 25};
        int n=arr.length;
        int []res=nextSmallerElements(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
