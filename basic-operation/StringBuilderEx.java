public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        //set char
        sb.setCharAt(0, 'Y');
        System.out.println(sb);
        //get char
        char ch=sb.charAt(0);
        System.out.println(ch);
        //insert
        sb.insert(1, 'e');
        System.out.println(sb);
        //delete
        sb.deleteCharAt(1);
        System.out.println(sb);
        //insert at end
        sb.append('o');
        System.out.println(sb);
        //length
        System.out.println(sb.length());
    }
}
