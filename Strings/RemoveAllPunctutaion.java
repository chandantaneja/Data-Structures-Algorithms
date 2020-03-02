package Strings;

public class RemoveAllPunctutaion {
    public static void main(String[] args) {
        String str = "Welcome???@@##$ to#$% the%$^ world $%^&Of @!!Progr%&amming";
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);
    }
}
