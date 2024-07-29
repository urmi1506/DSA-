public class CntNoTeams {
        public static int numTeams(int[] rating) {
            int teamCnt = 0;
            int n = rating.length;
    
            for (int i = 0; i < n; i++) {
                int rightLessCnt = 0, rightMoreCnt = 0, leftLessCnt = 0, leftMoreCnt = 0;
    
                // Count elements on right of i 
                for (int j = i + 1; j < n; j++) {
                    if (rating[j] < rating[i]) {
                        rightLessCnt++;
                    } else if (rating[j] > rating[i]) {
                        rightMoreCnt++;
                    }
                }
    
                // Count elements on  left of i
                for (int j = 0; j < i; j++) {
                    if (rating[j] < rating[i]) {
                        leftLessCnt++;
                    } else if (rating[j] > rating[i]) {
                        leftMoreCnt++;
                    }
                }
    
                // Calculate  no of valid teams
               teamCnt += leftLessCnt * rightMoreCnt + leftMoreCnt * rightLessCnt;
            }
    
            return teamCnt;
        }
        public static void main(String[] args) {
            int []rating = {2,5,3,4,1};
            System.out.println(numTeams(rating));
        }
    }
    

