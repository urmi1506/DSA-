public class CountCharOfStr {
    public static void main(String[] args) {
       String s= "#GeeKs01fOr@gEEks07"; 
       int[] res = count(s);

       System.out.println("Uppercase letters: " + res[0]);
       System.out.println("Lowercase letters: " + res[1]);
       System.out.println("Digits: " + res[2]);
       System.out.println("Other characters: " + res[3]);
       
    }
     static int[] count (String s)
    {
        int[] arr = new int[4];
        char[] ch = s.toCharArray(); //it convert str to arr for iterate string nd count characters
        for(int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                arr[0] +=1;
            }
            else if(Character.isLowerCase(ch[i])){
                arr[1] +=1;
            }
            else if(Character.isDigit(ch[i])){
                arr[2] +=1;
            }
            else{
                arr[3] +=1; 
            }
        }
        return arr;   
    }
}
