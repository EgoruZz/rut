import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int answer = Integer.MIN_VALUE;
        int count = 0;

        while (n > 0) {
            int number = scanner.nextInt();
            if ((number % 2 == 0) && (answer < number)) answer = number;
            if (number < 0) count++;
            n--;
        }

        if (answer == Integer.MIN_VALUE) {
            System.out.println("Наибольшее четное число: undefined");
        } else {
            System.out.printf("Наибольшее четное число: %d%n", answer);
        }

        if (count == 0) {
            System.out.println("Кол-во отрицательных: undefined");
        } else {
            System.out.printf("Кол-во отрицательных: %d%n", count);
        }
        scanner.close();
    }
}
