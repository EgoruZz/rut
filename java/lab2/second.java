import java.util.Scanner;
import java.util.Locale;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String fruit = scanner.nextLine().toLowerCase();
        String month = scanner.nextLine().toLowerCase();
        double mass = 0.0;
        int N = 100; // 31
        double discount = 0.93;
        double cost = 1.0;

        if (scanner.hasNextDouble()) {
            mass = Double.parseDouble(scanner.nextLine());
        } else {
            cost = 0.0;
        }
        if (mass <= 0.0) cost = 0.0;

        cost *= switch (fruit) {
            case "apple" -> 9.99 * N;
            case "banana" -> 11.49 * N;
            case "grapes" -> 15.99 * N;
            case "kimi" -> 37.99 * N;
            case "mango" -> 39.99 * N;
            case "orange" -> 17.99 * N;
            case "plum" -> 10.98 * N;
            default -> 0.0;
        };

        cost *= switch (month) {
            case "september", "october", "november" -> {
                if (fruit.equals("apple") || fruit.equals("orange")) {
                    yield discount;
                } else {
                    yield 1.0;
                }
            }
            case "december", "january", "february", "march", "april", "may",
            "june", "july", "august" -> 1.0;
            default -> 0.0;
        };

        if (cost == 0.0) {
            System.out.println("INVALID");
        } else {
            cost *= mass;
            cost = Math.ceil(cost * 100.0) / 100.0;
            System.out.printf("%.2f%n", cost);
        }

        scanner.close();
    }
}
