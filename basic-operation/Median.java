import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
    
       int[] v ={90 ,100 ,78, 89, 67};
       System.out.println(find_median(v));
    }
    public static int find_median(int[] v)
    {   
        
      Arrays.sort(v);
      if(v.length%2==0){
        int x= v[v.length/2];
        int y= v[v.length/2-1];
       return (x+y)/2;
    
      }
      else{
        return v[v.length/2];
      }  
      
    }
}
