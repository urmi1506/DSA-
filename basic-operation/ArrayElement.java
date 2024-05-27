public class ArrayElement {
    public static void main(String[] args) {
        int n=5;
        int a[]={10,20,30,40,50};
        int key=2;
        System.out.println(findElementAtIndex(a,n,key));  
    }
    static int findElementAtIndex(int a[], int n, int key) 
    {
    // by default array indexing is start from 0 therefore we are able to directly return key for find element
       return a[key]; 

       /*int pos;
       for(int i=0;i<n;i++)    // this is the loop for the array
       {
           if(i==key)   // the index if same as the key then print it pos
           pos=a[i];    
       }                         
       return pos; */         
    }
}
