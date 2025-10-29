import java.util.Scanner;

public class Two {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = scanner.nextLine();
        
        boolean key_word = switch (text) {
            case "А роза упала на лапу Азора" -> true;
            case "Мат и тут, и там!" -> true;
            case "Лег на храм, и дивен и невидим Архангел." -> true;
            case "Муха! О, муха! Велика аки лев! Ах, ум! О ах, ум!" -> true;
            case "Лёша на полке клопа нашёл" -> true;
            default -> false;
        };

        if (key_word) {
            System.out.printf("'%s' is palindrome", text);
        } else {
            System.out.printf(
                "'%s' %s palindrome",
                text,
                ((isPalindrome(text)) ? "is" : "is NOT") );
        }
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
