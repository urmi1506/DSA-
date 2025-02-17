package Hashing;

import java.util.HashSet;

public class NoTiles{
    public static int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        helper(tiles, "", set);
        return set.size();
    }
    private static void helper(String tiles, String curr, HashSet<String> set) {
        if (!curr.isEmpty()) {
            set.add(curr);  
        }

        for (int i = 0; i < tiles.length(); i++) {
            helper(tiles.substring(0, i) + tiles.substring(i + 1), curr + tiles.charAt(i), set);
        }
    }
    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles));
    }
}