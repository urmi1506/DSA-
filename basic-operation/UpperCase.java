public class UpperCase {
    public static void main(String[] args) {
        String s="i love programming";
        System.out.println(transform(s)); 
    }
    public static String transform(String s){
        String Str1= "";
        String[] str = s.split(" ");
        for(String str1: str){
            Str1 += str1.substring(0,1).toUpperCase()+ str1.substring(1)+" ";
        }
        return Str1;
    }
}
