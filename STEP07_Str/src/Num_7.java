import java.util.Scanner;

public class Num_7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String num1 = sc.next();
        String num2 = sc.next();

        num1 = (new StringBuffer(num1)).reverse().toString();//StringBuffer에 있는 reverse함수를 쓰기위해 객체 생성 후, num1 재정의
        num2 = (new StringBuffer(num2)).reverse().toString();


        int in_num1 = Integer.valueOf(num1);//String 타입이었던 num1 을 int로 변환
        int in_num2 = Integer.valueOf(num2);


        if (in_num1 > in_num2) {//값 비교 후 출력
            System.out.println(num1);
        } else if (in_num1 < in_num2) {
            System.out.println(num2);
        }


    }
}
