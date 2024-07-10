import java.util.Arrays;
// Brute force
public class ClosestThreeSum {
    
    static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        
        int res=0;
        int gap=Integer.MAX_VALUE;
        for(int i=0; i<array.length-2; i++){
            int li=i+1;
            int ri=array.length-1;
            while(li<ri){
                int sum=array[i]+array[li]+array[ri];
                
                if(sum<target){
                    int ngap=target-sum;
                    if(ngap<gap){
                        gap=ngap;
                        res=sum;
                    }
                    li++;
                }
                else if(sum>target){
                    int ngap=sum-target;
                    if(ngap<gap){
                        gap=ngap;
                        res=sum;
                }
                ri--;
            }
            else{
                return sum;
            }
        }
    }
    return res;
 }
}


