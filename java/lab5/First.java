package z;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int sum = 0;
        String number = "";
        System.out.println(summation(text, number, sum));
        scanner.close();
    }
    int summation(String text, String number, int sum) {
        char symbol = text.charAt(0);
        if (symbol == ' ') {
            sum += Integer.parseInt(number);
        } else {
            ...
            return sum;
        }
        return summation(text.substring(1, text.length()), number, sum);
    }
}
