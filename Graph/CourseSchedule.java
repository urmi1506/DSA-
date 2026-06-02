package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create adjacency list --->check dependency
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph -->know the edges (dependency)
        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            // b must completed before a
            adj.get(b).add(a);
        }

        //Calculate indegree --> know starting point 
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        //Add nodes with indegree 0 -->their no prerequisites → can be taken first
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // BFS 
        int cnt = 0; //-->check we proceed all courses or not (cycle or not)

        while (!q.isEmpty()) {
            int node = q.poll();
            // 1 course completed
            cnt++;

            for (int it : adj.get(node)) {
                // As course completed need to remove dependency
                indegree[it]--;
                // check other course which dont have prerequisite
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        // All courses proceed (no cycle)
        return cnt == numCourses;
    }
  
  public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        boolean  result = canFinish(numCourses, prerequisites);
        System.out.println(result);
  }
}
