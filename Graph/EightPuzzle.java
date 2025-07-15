package Graph;
import java.util.*;
public class EightPuzzle {

    static final String GOAL = "123456780"; 
    
    static int[][] moves = {
        {1, 3},        
        {0, 2, 4},     
        {1, 5},       
        {0, 4, 6},     
        {1, 3, 5, 7},  
        {2, 4, 8},     
        {3, 7},        
        {4, 6, 8},    
        {5, 7}         
    };

    static class State {
        String board;
        String path;

        State(String board, String path) {
            this.board = board;
            this.path = path;
        }
    }

    static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static String solve(String start) {
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new State(start, start + "\n"));
        visited.add(start);

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.board.equals(GOAL)) {
                return "Solved in BFS:\n" + current.path;
            }

            int zeroPos = current.board.indexOf('0');
            for (int move : moves[zeroPos]) {
                String nextBoard = swap(current.board, zeroPos, move);
                if (!visited.contains(nextBoard)) {
                    visited.add(nextBoard);
                    queue.add(new State(nextBoard, current.path + nextBoard + "\n"));
                }
            }
        }

        return "No solution found.";
    }

    public static void main(String[] args) {
        String start = "120453786"; 
        System.out.println(solve(start));
    }
}


