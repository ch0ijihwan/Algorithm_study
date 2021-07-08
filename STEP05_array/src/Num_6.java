import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Num_6 {
    public static void main(String[] args) {



        Scanner sc =  new Scanner(System.in);

        String [] arr = new String[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();

        }

        sc.close();


        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            int sum = 0;


            for (int j = 0; j < arr[i].length(); j++) {

                if(arr[i].charAt(j) == 'O'){
                    count ++;

                }else{
                    count = 0;

                }

                sum = sum + count;



            }
            System.out.println(sum);

        }


    }
}
