import java.util.Scanner;

public class Num_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if ((number % 4 == 0) && (number % 100 !=0) || number%400 == 0 ){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
