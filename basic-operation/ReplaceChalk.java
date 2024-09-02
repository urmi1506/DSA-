public class ReplaceChalk {
    public static int chalkReplacer(int[] chalk, int initialChalkPieces) {
        // Cal total amount of chalk need
        long totalChalkReq = 0;
        for (int chalkForStud : chalk) {
            totalChalkReq += chalkForStud;
        }
        
        // Cal remaining chalk after accounting for full cycles of all students
        int remainingChalk = (int)(initialChalkPieces % totalChalkReq);
        
        //  where chalk run out
        for (int studInd = 0; studInd < chalk.length; studInd++) {
            // Check remaining chalk is less than what the current student needs
            if (remainingChalk < chalk[studInd]) {
                // index of stud where chalk run out
                return studInd;
            }
            remainingChalk -= chalk[studInd];
        }
        
        return 0;  
    }
    public static void main(String[] args) {
        int[]chalk = {5,1,5};
        int initialChalkPieces= 22;
        System.out.println(chalkReplacer(chalk, initialChalkPieces));
    }
}
