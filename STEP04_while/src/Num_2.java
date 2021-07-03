
import java.util.Scanner;

public class Num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while (sc.hasNextInt()) { // 값이 없을 때 까지.

            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1 + num2);

        }
    }
}
