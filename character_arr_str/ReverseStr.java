package character_arr_str;

public class ReverseStr {
    public static void main(String[] args) {
        ReverseStr obj = new ReverseStr();
        String str = "hello";
        char[] charArray = str.toCharArray();
        obj.getrev(charArray, charArray.length);
        String reversedStr = new String(charArray);
        System.out.println("Reversed string: " + reversedStr);
    }

    int getCount(String S) {
        return S.length();
    }

    void getrev(char ch[], int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
