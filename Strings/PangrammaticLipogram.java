package Strings;

public class PangrammaticLipogram {

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumped over the lazy dog";
        String str2 = "The quick brown fox jumps over the lazy dog";
        String str3 = "The quick brown fox jum over the lazy dog";
        checkPangrammaticLipogram(str1);
        checkPangrammaticLipogram(str2);
        checkPangrammaticLipogram(str3);
    }

    private static void checkPangrammaticLipogram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') index = str.charAt(i) - 'A';
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') index = str.charAt(i) - 'a';

            mark[index] = true;
        }
        int countFalse = 0;
        for (boolean val : mark) {
            if (!val) {
                countFalse++;
            }
        }
        switch (countFalse){
            case 0:
                System.out.println(str + " is a pangram");
                break;
            case 1:
                System.out.println(str + " is a pangrammatic lipogram");
                break;
            default:
                System.out.println(str + " is a lipogram");
        }
    }
}

