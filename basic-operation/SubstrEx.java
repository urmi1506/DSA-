public class SubstrEx {
    public static void main(String[] args) {
        // SubString not give end character..always go from left to right otherwise give exception...from as same start & end give null or blank
        String s1="urmi";
        System.out.println(s1.substring(0,2));
        System.out.println(s1.substring(0));
        // ptint all substring
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j <= s1.length(); j++) {
                System.out.println(s1.substring(i , j));
            }
            
        }

    }
}
