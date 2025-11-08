import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            numbers[i] = digit;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) System.out.printf("%d", numbers[i]);
            else System.out.printf("%d ", numbers[i]);
        }

        scanner.close();
    }
}
