package z;

import java.util.Scanner;

public class Two {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = scanner.nextLine();
        String begin_text = text;

        String junk = " .!,?<>'%$#-+=:*";
        for (char symbol : junk.toCharArray()) {
            text = text.replace(String.valueOf(symbol), "");
        }
        text = text.toLowerCase();
        

        System.out.printf(
            "'%s' %s palindrome",
            begin_text,
            ((isPalindrome(text)) ? "is" : "is NOT") );
    }

    static boolean isPalindrome(String msg) {
        if (msg.length() == 0 || msg.length() == 1) return true;
        else {
            if (msg.charAt(0) != msg.charAt(msg.length() - 1)) {
                return false;
            } else {
                return isPalindrome(msg.substring(1, msg.length() - 1));
            }
        }
    }
}
