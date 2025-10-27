import java.util.Scanner;

public class TicketClerk {
    public static void main(String[] args) {
        double N = 31.0;
        double cost = 123.45 * N, discount = 0.95;
        
        Scanner scanner = new Scanner(System.in);
        int passengers = scanner.nextInt();
        double result = cost * passengers;
        result *= discount;

        System.out.printf("%.2f", result);
        scanner.close();
    }
}
