import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m == 12 && m <= 2) {
            System.out.println("winter");
        } else if (m >= 3 && m <= 5) {
                System.out.println("spring");
            } else if (m >= 6 && m <= 8) {
            System.out.println("summer");
        } else if (m >= 9 && m <= 11) {
            System.out.println("autumn");
        }
        }
    }
