package Strings;

public class MakePangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the dog";
        findMissingChars(str);
    }

    private static void findMissingChars(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

            mark [index] = true;
        }
        for (int i = 0; i < mark.length; i++){
            if(!mark[i]){
                System.out.print((char) (i + 'a') + " ");
            }
        }
    }
}
