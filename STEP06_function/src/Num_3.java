import java.util.Scanner;

public class Num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_num = sc.nextInt();

        System.out.println(hansu_check(input_num));


    }

    public static int hansu_check(int num) {

        if (num < 100) { //100보다 작은 경우 모든 수를 한수로 처리
            return num;

        }else { // num이 100보다 큰 경우

            if (num == 1000) { // 예외처리(3자리수까지만 확인함)
                num = 999;
            }


            int count = 0;

            for (int i = 100; i <= num; i++) {


                int num_1 = i / 100;
                int num_2 = (i / 10) % 10;
                int num_3 = i % 10;


                if ((num_1 - num_2) == (num_2 - num_3)) {
                    count++;
                }

            }

            return 99 + count; //100이하일 때 99 + 100이상 일 때 한수의 개수
        }
    }
}
