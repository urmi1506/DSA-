package Heap;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        // A-Z letter
        int freq[] = new int[26];
        // cal freq of each tasks
        for(char task :tasks){
            freq[task - 'A']++;
        }
        // cal max freq
        int maxFreq=0;
        for(int cnt:freq){
            maxFreq = Math.max(maxFreq ,cnt);
        }
        // cal np of task with maxFreq
        int maxCnt=0;
        for(int cnt : freq){
            if(cnt == maxFreq)
               maxCnt++;
        }
        // cal intervals
        int intervals =(maxFreq-1) * (n+1)+maxCnt;

    return Math.max(tasks.length ,intervals);
    }
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(leastInterval(tasks,n));
    }
}
