import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char right = scanner.nextLine().charAt(0);
        char left = scanner.nextLine().charAt(0);
        int idx = scanner.nextInt();
        // scanner.nextLine();
        char symbol = scanner.next().charAt(0);
        
        text = text.substring(0, text.indexOf(right)) + text.substring(text.indexOf(left) + 1, text.length());
        System.out.println(text);

        text = text.replace(text.charAt(idx), symbol);
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);

        scanner.close();
    }
}
