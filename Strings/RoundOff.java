package Strings;

public class RoundOff {
    public static void main(String[] args) {
        int num = 4772;
        roundOff(num);

    }

    private static void roundOff(int num) {
        int temp = num % 10;
        if(temp <= 4) num -= temp;
        else num += (10 - temp);
        System.out.println(num);
    }
}
