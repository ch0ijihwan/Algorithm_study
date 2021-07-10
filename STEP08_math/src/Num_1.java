//1712
import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fixed_cost = sc.nextInt();
        int variable_cost = sc.nextInt();
        int price = sc.nextInt();


        if(variable_cost>=price){
            System.out.println("-1");

        }
        else{
            System.out.println((fixed_cost/(price-variable_cost))+1);
        }






    }
}
