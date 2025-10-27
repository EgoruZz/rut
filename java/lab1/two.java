import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        int N = 31;

        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);

        System.out.println(symbol += N);
        scanner.close();
    }
}
