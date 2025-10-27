import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 100; // 31;
        int start1 = -5 * N, finish1 = 1 * N;
        int start2 = 5 * N, finish2 = 10 * N;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if ((start1 <= number && number <= finish1) ||
            (start2 <= number && number <= finish2)) {
                System.out.printf("Correct_number_%d%n", number);
                break; // printf("%f", number)
            } else {
                System.out.println("Not_yet");
            }
        }

        scanner.close();
    }
}
