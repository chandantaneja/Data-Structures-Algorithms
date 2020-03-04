package Strings;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        String str1 = "geeks for geeks";
        swapFirstAndLastChar(str1.toCharArray());
    }

    private static void swapFirstAndLastChar(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            int j = i + 1;
            for (; j < charArr.length; j++) {
                if (charArr[j] == ' ') {
                    char temp = charArr[j + 1];
                    charArr[j + 1] = charArr[i];
                    charArr[i] = temp;
                }
            }
            i = j;
        }
        System.out.println(charArr);
    }
}
