package Strings;

public class NameInitials {
    public static void main(String[] args) {
        String name = "Chandan Taneja";
        makeInitials(name);
    }

    private static void makeInitials(String name) {
        System.out.print(Character.toUpperCase(name.charAt(0)));
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ') System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
        }
    }
}
