import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 31;
        int prime = Integer.MAX_VALUE;
        int non_prime = Integer.MIN_VALUE;
        String word = scanner.nextLine();

        while (!word.equals("stop")) {
            int number = Integer.parseInt(word);
            if (number <= 1 || number == N) {
                System.out.println("invalid");
                word = scanner.nextLine();
                continue;
            }
            boolean find = false;
            for (int x = 2; x * x <= number && !find; x++) {
                find = number % x == 0;
                non_prime = (non_prime < number && find) ? number : non_prime;
            }
            prime = (number < prime && !find) ? number : prime;
            word = scanner.nextLine();
        }

        System.out.printf("prime_%s%n",
        (prime != Integer.MAX_VALUE) ? prime : "undefined");
        System.out.printf("non-prime_%s%n",
        (non_prime != Integer.MIN_VALUE) ? non_prime : "undefined");
        scanner.close();
    }
}
