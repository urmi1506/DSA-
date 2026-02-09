package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph 
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            adj.get(b).add(a);
        }

        // Step 1: Calculate indegree
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        // Step 2: Add nodes with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: BFS (Topological Sort)
        int cnt = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            cnt++;

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        return cnt == numCourses;
    }
  
  public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        boolean  res = canFinish(numCourses, prerequisites);
        System.out.println(res);
  }
}
