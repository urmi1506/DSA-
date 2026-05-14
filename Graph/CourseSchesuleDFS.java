package Graph;

import java.util.ArrayList;

public class CourseSchesuleDFS {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }


        // Build graph
        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];

            adj.get(b).add(a);
        }

        /*
            visited[]:
            Tells whether node was visited before

            pathVisited[]:
            Tells whether node is currently
            present in current DFS recursion path
        */

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];

        // DFS for every node
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, pathVisited)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean dfs(int node,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited,
                       boolean[] pathVisited) {

        // mark node as visited
        visited[node] = true;

        // mark node in current DFS path
        pathVisited[node] = true;

        // visit all adjacent nodes
        for (int it : adj.get(node)) {

            // adjacent node not visited
            if (!visited[it]) {
                // do DFS
                if (dfs(it, adj, visited, pathVisited)) {
                    return true;
                }
            }

            // node already exists in current DFS path
            
            else if (pathVisited[it]) {
                return true;
            }
        }
        
        //remove node from current DFS path -->DFS work of this node finished
        pathVisited[node] = false;

        return false;
    }
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        boolean  res = canFinish(numCourses, prerequisites);
        System.out.println(res);
  }

}
