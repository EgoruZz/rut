import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double N = 31.0;
        double result = (N + 2.0) / Math.sqrt(Math.abs(a * b)) -
                        Math.abs(((double) a - N) / (2 * b));
        
        System.out.printf("%.3f%n", result);
        scanner.close();
    }
}
