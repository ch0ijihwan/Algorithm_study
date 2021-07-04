import java.util.Scanner;

//11720
public class Num_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int sum = 0;

        int num_count = sc.nextInt();
        String numbers = sc.next();



        for (int i = 0; i < num_count; i++) {
            sum+= numbers.charAt(i) - '0'; //유니코드로 넘어가기 때문에, 숫자 0을 빼줘서 정수를 빼낸다.( char에서 숫자를 빼서 Int로 변환한다고 개념적으로 이해)
        }
        System.out.println(sum);


    }
}
