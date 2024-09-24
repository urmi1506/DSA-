package Trees;

public class MaxNode {
    static int maximumNode(int i){
        return (int) Math.pow(2, i-1);
    }
    public static void main(String[] args) {
        int i=3;
        System.out.println(maximumNode(i));
    }
}
