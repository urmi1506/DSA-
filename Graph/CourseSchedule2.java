package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
         int n = prerequisites.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];

            adj.get(b).add(a);
        }

        int[] indegree = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> bfs = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                bfs.add(i);
            }
        }

        int[] topo = new int[numCourses];
        int idx = 0;

        while(!bfs.isEmpty()){
            int node= bfs.poll();
            topo[idx++] = node;

            for(int it :adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    bfs.add(it);
                }
            }
        }
    if(idx == numCourses) return topo;
    
    return new int[0];
    }
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        int[]  result = findOrder(numCourses, prerequisites);
        for (int i : result) {
            System.out.print(i);
            System.out.print( " ");
        }
    }
}
