import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 1, num2 =1;


        while (num1 != 0 & num2 !=0){

            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if(num1 != 0 & num2 !=0){
            System.out.println(num1+num2);

            }

        }
    }
}
