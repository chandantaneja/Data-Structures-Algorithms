package Strings;

public class CharSet {
    final static char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        String charSet = "qwertyuiopasdfghjklzxcvbnm";
        String str1 = "egrt";
        decodeString(str1.toCharArray(), charSet);
    }

    private static void decodeString(char[] str1, String charSet) {
        StringBuilder result = new StringBuilder();
        for(char val : str1){
            result.append(alphabets[charSet.indexOf(val)]);
        }
        System.out.println(result.toString());
    }
}
