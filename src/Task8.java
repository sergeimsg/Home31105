import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int y = (m*(m+1))/2;
        System.out.println(y+ "расчет по формуле");
        int i = 0;
        int x=0;
        for (;i<=m;i++) {
            x=x+i;
           System.out.println(i+"   "+x+"  ответ");}
        }
         }
