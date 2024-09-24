import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b >= 45) {
            System.out.printf("%d %d", a, b - 45);
        } else {
            if (a == 0) {
                System.out.printf("%d %d", 23, 60 - (45 - b));
            } else {
                System.out.printf("%d %d", a - 1, 60 - (45 - b));
            }
        }
    }
}