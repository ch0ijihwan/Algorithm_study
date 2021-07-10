//10872

import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        System.out.println(fac(n));
    }

    public static int fac(int n) {

        if(n > 1){
            return fac(n - 1) * n;

        }
        else return 1;


    }
}



