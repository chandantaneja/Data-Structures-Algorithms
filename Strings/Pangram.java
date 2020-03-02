package Strings;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str2 = "The quick brown fox jumps over the dog";
        if (checkPangram(str))
            System.out.println(str + " is a pangram.");
        else
            System.out.println(str + " is not a pangram.");

        if (checkPangram(str2)) System.out.println(str2 + " is a pangram");
        else System.out.println(str2 + " is not a pangram");
    }

    private static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') index = str.charAt(i) - 'A';
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') index = str.charAt(i) - 'a';

            mark[index] = true;
        }
        for (boolean val : mark) {
            if (!val) {
                return false;
            }
        }
        return true;

    }
}
