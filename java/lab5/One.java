import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        voice(scanner.nextInt());
        scanner.close();
    }
    static void voice(int number) {
        System.out.println(
            switch (number) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                default -> "I'm tired";
            }
        );
    }
}
