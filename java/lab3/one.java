import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 31;
        int sum = 0;
        int enter = 0;

        do {
            sum += enter;
            enter = scanner.nextInt();
        } while (!(enter < 0 || enter > N));

        System.out.println(sum);
        scanner.close();
    }
}
