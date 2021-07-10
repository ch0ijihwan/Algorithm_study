//https://www.acmicpc.net/problem/2839

import java.util.Scanner;

public class Num_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int sugar_we = sc.nextInt();

        int count = 0;


        while (true) {


            if (sugar_we % 5 == 0) {//딱 맞아 떨어진다면

                count = count + sugar_we / 5;

                System.out.println(count);

                break;

            } else {

                sugar_we = sugar_we - 3;
                count++;


            }
            if (sugar_we < 0) {

                System.out.println(-1);
                break;
            }

        }


    }
}
