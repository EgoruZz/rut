import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cost = 0;
        boolean placed = true;

        String place = scanner.nextLine();

        while (true) {
            if (place.equals("stop")) break;
            if (scanner.hasNextInt()) {
                if (cost == 0) {cost = Integer.parseInt(scanner.nextLine());}
                else {sum += Integer.parseInt(scanner.nextLine());}
                if (cost <= sum && placed) {
                    System.out.printf("Going to %s%n", place);
                    sum -= cost;
                    placed = false;
                }
            } else {
                place = scanner.nextLine();
                if (cost != 0) cost = 0;
                placed = true;
            }
        }
        scanner.close();
    }
}
