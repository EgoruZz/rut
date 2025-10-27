import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        int power = 1;
        while (limit > power) power *= 2;

        power /= 2;
        int deg = (int) (Math.log(power) / Math.log(2.0));

        System.out.printf("Значение 2 в степени %d равно %d%n", deg, power);
        scanner.close();
    }
}
