public class RecEx {
    public static void main(String[] args) {
        int src=1;
        int dest=10;
        reachHome(src,dest);

    }
    static void reachHome(int src,int dest){
        if(src==dest){
        System.out.println("reached");
        return;}
        src++;
        reachHome(src, dest);
    }

}
