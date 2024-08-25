public class NoPairsAdv {
    public static long countPairs(int x[], int y[], int M, int N) {
        int suffix[]=new int[1002];
        long cnt=0;
        for(int i=0;i<N;i++){
            suffix[y[i]]++;
        }
        
        for(int i=1000;i>=3;i--){
            suffix[i]=suffix[i]+suffix[i+1];
        }
         for(int i=0;i<M;i++){
            if(x[i]==1){
                continue;
            }
            else if(x[i]==2){
                cnt+=suffix[1]+suffix[5];
            }
            else if(x[i]==3){
                 cnt+=suffix[1]+suffix[2]+suffix[4];  
            }
            else{
                cnt+=suffix[1]+suffix[x[i]+1];
            }
        }   
      return cnt; 
    }
    public static void main(String[] args) {
        int x[] = {2 ,3 ,4 ,5};
        int y[] = {1 ,2 ,3};
        int M = x.length;
        int N = y.length;
        System.out.println(countPairs(x, y, M, N));
    }
}
