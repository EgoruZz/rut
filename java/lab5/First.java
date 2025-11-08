import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        
        int N = 100; // 31;
        int a = Integer.parseInt(s1.substring(1, s1.indexOf(',')));
        int b = Integer.parseInt(s1.substring(s1.indexOf(',') + 1, s1.length() - 1));
        int c = Integer.parseInt(s2.substring(1, s2.indexOf(',')));
        int d = Integer.parseInt(s2.substring(s2.indexOf(',') + 1, s2.length() - 1));

        double ans = area(a * N, b * N, c * N, d * N);
        ans = ((double) Math.round(ans * 100)) / 100;
        System.out.println(ans);
        scanner.close();
    }

    public static double area(int a, int b, int c, int d) {
        double r = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
        return Math.PI * Math.pow(r, 2);
    }
}
