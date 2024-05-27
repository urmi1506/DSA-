public class palindromeStr {
    public static void main(String[] args) {
        char ch[] = {'l', 'a', 'a', 'l'};
        revstr(ch); 
        System.out.println(ch);
        
        if (isPalindrome(ch)) { 
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    static void revstr(char ch[]){
        int start=0;
        int end =ch.length-1;
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
    static boolean isPalindrome(char ch[]) { 
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            if (ch[start] != ch[end]) { 
                return false;
            }
            start++;
            end--;
        }
        return true; 
    }
}
