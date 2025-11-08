import java.util.Scanner;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
            .stream(scanner.nextLine().split(" "))
            .mapToInt(word -> Integer.parseInt(word))
            .toArray();
        
        int n = numbers.length;
        int sum = Arrays.stream(numbers).sum();

        System.out.println(sum);
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!(numbers[i] < numbers[j])) {
                    System.out.printf("%d ", numbers[i]);
                    break;
                }
            }
        }

        scanner.close();
    }
}
