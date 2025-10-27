import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moving = Integer.parseInt(scanner.nextLine());
        int stopping = Integer.parseInt(scanner.nextLine());
        String finish = scanner.nextLine();
        int finishing = Integer.parseInt(finish.substring(0, 2)) * 60 +
        Integer.parseInt(finish.substring(3, 5));

        int starting = finishing - moving - stopping;
        if (starting < 0) starting = 24 * 60 + starting;

        String start = (starting / 60 <= 9) ? "0" + Integer.toString(starting / 60) : Integer.toString(starting / 60);
        start += ":";
        start += (starting % 60 <= 9) ? "0" + Integer.toString(starting % 60) : Integer.toString(starting % 60);
        System.out.println(start);
        scanner.close();
    }
}
