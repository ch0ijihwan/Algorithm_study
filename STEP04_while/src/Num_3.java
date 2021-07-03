import java.util.Scanner;

public class Num_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int number = sc.nextInt();
        int result = number;



        int first_num = 0;
        int second_num = 0;
        int temp = 0;
        int  new_number = 0 ;

        int count =0;




        while (true ) {

            first_num = number / 10; //앞자리
            second_num = number % 10; //뒷자리
            temp = (first_num + second_num) % 10; //임시공간에 각 자리를 더하고 뒤에 값만 빼줌

            new_number = (second_num * 10) + temp; // 새로운 숫자를 만들어 주는데 그 수는 그 전의 뒤에 수가 10의 자리가 되고, 새로운 값(temp)가 일의 자리 수가 됨.

            number = new_number;
            count++; //카운드


            if (new_number == result) {
                break;
            }
        }
        System.out.println(count);


    }
}
