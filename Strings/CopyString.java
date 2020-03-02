package Strings;

public class CopyString {
    public static void main(String[] args) {
        char[] str1 = "This is a program".toCharArray();
        char[] str2 = new char[str1.length];

        char[] str3 = "Java is the best".toCharArray();
        char[] str4 = new char[str3.length];

        copyStringUsingIteration(str1, str2);
        System.out.println(String.valueOf(str2));
        copyUsingRecursion(str3, str4, 0);
        System.out.println(String.valueOf(str4));
    }

    private static void copyUsingRecursion(char[] str3, char[] str4, int si) {
        if(si == str3.length) return;
        str4[si] = str3[si];
        copyUsingRecursion(str3, str4, si + 1);

    }

    private static void copyStringUsingIteration(char[] str1, char[] str2) {
        for (int i = 0; i < str1.length; i++)
            str2[i] = str1[i];
    }
}
