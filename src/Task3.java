import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}
