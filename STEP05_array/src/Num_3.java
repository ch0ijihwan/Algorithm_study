import java.util.Scanner;

public class Num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A * B * C;


        String result = String.valueOf(mul);

        int [] count_arr = new int [10];

        for (int i = 0; i < result.length(); i++) {
            int temp  =  result.charAt(i); //유니코드 값 저장
            count_arr[temp-48] ++;
        }

        for (int i = 0; i < count_arr.length; i++) { // count_arr의 값 출력
            System.out.println(count_arr[i]);

        }

    }
}
