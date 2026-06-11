package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegion {
    public static void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        // Add boundary 'O's
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if ((r == 0 || r == rows - 1 || c == 0 || c == cols - 1)
                        && board[r][c] == 'O') {
                    queue.offer(new int[]{r, c});
                    visited[r][c] = true;
                }
            }
        }

        bfs(board, queue, visited);

        // Flip unvisited 'O' -> 'X'
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'O' && !visited[r][c]) {
                    board[r][c] = 'X';
                }
            }
        }
    }

    private static void bfs(char[][] board, Queue<int[]> queue, boolean[][] visited) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] directions = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int r = node[0], c = node[1];

            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nc < 0 || nr >= rows || nc >= cols) continue;
                if (visited[nr][nc]) continue;
                if (board[nr][nc] != 'O') continue;

                visited[nr][nc] = true;
                queue.offer(new int[]{nr, nc});
            }
        }
    }

    public static void main(String[] args) {
        char[][] board ={{'X','X','X','X'},{'X','O','O','X'},
                         {'X','X','O','X'},{'X','O','X','X'}};

        solve(board);
        for (char[] it : board) {
            System.out.println(Arrays.toString(it));
        }
    }
}
