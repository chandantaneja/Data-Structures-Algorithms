package Strings;

public class ExtraChar {
    public static void main(String[] args) {
        String strA = "abcd";
        String strB = "cbdad";
        findExtraChar(strA, strB);
    }

    private static void findExtraChar(String strA, String strB) {
        int sumOfStringA = 0, sumOfStringB = 0;
        for (int i = 0; i < strA.length(); i++) {
            sumOfStringA += strA.charAt(i);
        }
        for (int j = 0; j < strB.length(); j++) {
            sumOfStringB += strB.charAt(j);
        }

        int result = sumOfStringB - sumOfStringA;
        System.out.println((char)(result));
    }
}
