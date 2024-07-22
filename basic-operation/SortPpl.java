import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPpl {
     public static String[] sortPeople(String[] names, int[] heights) {
        // create map to assosiate names & its corresponding heights
        Map<Integer,String> map=new HashMap<>();
        
        for(int i=0; i<names.length; i++){
            // put values
            map.put(heights[i],names[i]);
        }
       //    sort height;
        Arrays.sort(heights);
        // create String array to store name in descending order
        String []ans=new String[heights.length];
        // index to track position
        int ind=0;
        // iterate array from highest to lowest heights
        for(int i=heights.length-1; i>=0; i--){
            // get the assosiate name
            ans[ind]=map.get(heights[i]);
            ind++;
        }
    return ans;
    }
    public static void main(String[] args) {
        String []names = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        String[] sortedNames = sortPeople(names, heights);
        
        // print sorted names
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}
