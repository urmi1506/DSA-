public class NoPairs {
    public static long countPairs(int x[], int y[], int M, int N) {
                long cnt=0;
                for(int i =0;i<M;i++){
                    for(int j =0;j<N;j++){
                        double xy = Math.pow(x[i],y[j]);
                        double yx = Math.pow(y[j],x[i]);
                        if(xy>yx)cnt++;
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
