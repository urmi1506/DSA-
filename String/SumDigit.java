package String;

public class SumDigit {
    public static int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char x : s.toCharArray()) {
            num.append(x - 'a' + 1);
        }
        
        while (k > 0) {
            int temp = 0;
            for (char x : num.toString().toCharArray()) {
                temp += x - '0';  
            }
            num = new StringBuilder(String.valueOf(temp));  
            k--;
        }
        int ans=Integer.parseInt(num.toString());  

        return ans;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k));
    }
}
