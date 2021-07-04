import java.util.Scanner;

public class Num_3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        for (char i = 'a'; i <= 'z'; i++) {

            System.out.printf(str.indexOf(i)+" ");

        }


    }
}
