import java.util.Scanner;

public class Main {
    public static void main (String[] Args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = 4;
        if (a > 0 && b > 0) {
            answer = 1;
        } else if (a < 0 && b > 0) {
            answer = 2;
        } else if (a < 0 && b < 0) {
            answer = 3;
        }
        System.out.println(answer);
    }
}
