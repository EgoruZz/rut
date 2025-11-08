import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(summation(scanner.nextLine() + ' ', 0, "", 0));
        scanner.close();
    }

    public static int summation(String text, int idx, String number, int sum) {
        if (idx == text.length()) return sum;
        char symbol = text.charAt(idx);
        if (symbol != ' ') return summation(text, idx + 1, number + symbol, sum);
        else {
            try {sum += Integer.parseInt(number);} catch (NumberFormatException e) {};
            return summation(text, idx + 1, "", sum);
        }
    }
}
