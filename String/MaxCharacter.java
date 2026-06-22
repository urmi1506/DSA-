package String;

public class MaxCharacter {
    public static char maxOccuringCharacter(String str){
        int maxi = 0;

        int[] arr = new int[26];

        for(char ch :str.toCharArray()){
            arr[ch - 'a']++;
        }
        
        char res = 'a';
        for(int i=0; i<26; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
                res = (char) (i +'a');
            }
        }
    
    return res;
    }

    public static void main(String[] args) {
        String str = "test";
        char maxiChar = maxOccuringCharacter(str);
        System.out.println(maxiChar);
    }
}
