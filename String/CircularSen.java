package String;

public class CircularSen {
        public static boolean isCircularSentence(String sentence) {
            int n = sentence.length();
    
            for (int i = 0; i < n; i++) {
                if (sentence.charAt(i) == ' ') {
                    // Check if the last character of the current word matches the first character of the next word
                    if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                        return false;
                    }
                }
            }
    
            // Finally, check if the first and last characters of the entire sentence match
            return sentence.charAt(0) == sentence.charAt(n - 1);
        }
        public static void main(String[] args) {
            String sentence = "leetcode exercises sound delightful";
            System.out.println(isCircularSentence(sentence));
        }
    }
    

