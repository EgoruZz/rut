import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int N = 31;
        number += N;
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scanner.close();
    }
}
