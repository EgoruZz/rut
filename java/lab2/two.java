import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = switch (text) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "workday";
            case "Saturday", "Sunday" -> "holiday";
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница" -> "рабочий";
            case "Суббота", "Воскресенье" -> "выходной";
            default -> "invalid weekday";
        };

        System.out.println(result);
        scanner.close();
    }
}
