import java.util.Scanner;

public class Main {
    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int answer = 0;
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
            answer = 1;
        }
        System.out.println(answer);
    }
}