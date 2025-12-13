package String;

public class LenLongestSubstr {
    public static int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int maxLen = 0;

        //Traverse string
        for(int i =0 ; i< n; i++){
            boolean[] visited = new boolean[256];
            int currLen = 0;

            //Expand substring
            for(int j=i; j<n; j++){
                char ch = s.charAt(j);

                //check already visited
                if( visited[ch]) break;

                visited[ch] = true;
                currLen++;
            }
            maxLen =Math.max(currLen , maxLen);
        }
    return maxLen;
    }
    public static void main(String[] args) {
        String s ="abcabcbb";

        int ans = lengthOfLongestSubstring(s);

        System.out.println(ans);
    }
}
