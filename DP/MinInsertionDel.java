package DP;
public class MinInsertionDel{
    public static int minOperations(String str1, String str2) 
	{ 
	    int n = str1.length();
        int m = str2.length();
        
        int lcsLen = lcs(str1, str2, n, m);
        
        int deletions = n - lcsLen;
        int insertions = m - lcsLen;
        
        int ans= deletions + insertions;
        
        return ans;
	} 
	 private static int lcs(String str1, String str2, int n, int m){
        int[][] dp = new int[n+1][m+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
	 }
     public static void main(String[] args) {
        String str1 = "heap";
        String str2 = "pea" ;
        System.out.println(minOperations(str1, str2) );
     }
}