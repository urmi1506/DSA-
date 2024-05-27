public class ReverseVowel {
    public static void main(String[] args) {
       String s="geeksforgeeks";
       System.out.println(modify (s)); 
    }
    static String modify (String s)
    {   
        for (int i = 0; i < s.length(); i--) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.print(" " + s.charAt(i));
			} 
            if()
    }
}
}
