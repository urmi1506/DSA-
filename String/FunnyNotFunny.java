package String;

class FunnyNotFunny{
     public static String findString(int n ,int d){
    //   check freq of character
    int[] freq = new int[26];
    int curr =0;
    for(int i=0; i<n; i++){
         freq[curr]++;

        // d pos ahed circular
        curr = (curr + d) %26;
    }
    int odd=0;
    int even=0;
    for(int i=0;i<26;i++){
        if (freq[i] == 0) continue;
        // odd
        if(freq[i] % 2 != 0){
            odd++;
        }else{
            even++;
        }
    }
    return odd > even ? "Funny String" : "Non Funny Sting";
}
public static void main(String[] args) {
    int n=4;
    int d=4;

    String Res = findString(n, d);
    System.out.println(Res);
}

}
