public class StrSplit {
   public static void main(String[] args) {
    String s1="urmi nups aaru sari";
    String[] chunks=s1.split(" "); 
    for (int i = 0; i < chunks.length; i++) {
        System.out.println(chunks[i]);
    }
   } 
}
