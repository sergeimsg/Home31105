import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        if (tt > -5) {
            System.out.println("�����");
            } else if (tt<=-20) {
             System.out.println("�������");
            } else if (tt>-20 && tt<=-5){
              System.out.println("���������");
        }
    }
}
