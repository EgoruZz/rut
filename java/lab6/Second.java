import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String word2 : arr2) {
            for (String word1 : arr1) {
                if (word2.length() == word1.length()) {
                    System.out.printf("%s ", word2);
                    break;
                }
            }
        }
    }
}
