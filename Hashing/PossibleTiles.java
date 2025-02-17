package Hashing;

import java.util.HashSet;

public class PossibleTiles {

    public static int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, "", used, set);
        return set.size();
    }

    private static void backtrack(String tiles, String curr, boolean[] used, HashSet<String> set) {
        if (!curr.isEmpty()) {
            set.add(curr);  
        }
        
        for (int i = 0; i < tiles.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                backtrack(tiles, curr + tiles.charAt(i), used, set);
                used[i] = false;  
            }
        }
    }

    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles));
    }
}


