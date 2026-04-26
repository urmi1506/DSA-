package Easy;

public class FurtherestDist {
    public static int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blanks = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else blanks++;
        }

        return Math.abs(left - right) + blanks;
    }
    public static void main(String[] args) {
        String moves = "L_RL__R";
        int furtherest_dist = furthestDistanceFromOrigin(moves);
        System.out.println(furtherest_disttwo);
    }
}
