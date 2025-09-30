
import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs={"d1/","d2/","../","d21/","./"};
        System.out.println(miniOperations(logs));
    }
    //Give a nested directory we need to perform push pop opration so we can easily handle directory using stack due to lifo property thats y we use srtack here
    public static int miniOperations(String[] logs){
        Stack <String> s=new Stack<>();
        //iterate array 
        for (String ans : logs) {
            // ../ = pop current directory nd push to main directory
            if(ans.equals("../")){
                if(!s.isEmpty()){
                s.pop();
                }
            }
            // push to main directory
            else if(!ans.equals("./")){
               s.push(ans);
            }
        }
        return s.size();
    }
}
