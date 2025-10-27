import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int start = Integer.parseInt(scanner.next());
        int finish = Integer.parseInt(scanner.next());

        for (int i = start; i <= finish; i++) {
            if (i < 0) continue;
            int factorial = 1;
            for (int j = 2; j <= i; j++) factorial *= j;
            sum += factorial;
            System.out.printf("%d! = %d%n", i, factorial);
        }

        System.out.println(sum);
        scanner.close();
    }
}
