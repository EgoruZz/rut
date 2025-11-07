import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int sum = 0;
        int N = 31;

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.next());
        int finish = Integer.parseInt(scanner.next());
        
        for (int i = start; i <= finish; i++) {
            if (i % 3 == 0) continue;
            if (i != N) sum += i;
        }

        System.out.println(sum);
        scanner.close();
    }
}
