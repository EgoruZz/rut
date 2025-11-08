import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        int[] numbers = new int[words.length];
        int N = 31;

        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }

        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < words.length; i++) {
            if (numbers[i] % 2 == 0) sum += numbers[i];
            if (numbers[i] % N == 0) sum1 += numbers[i];
        }

        System.out.println(sum);
        System.out.println(sum1);
    }
}
