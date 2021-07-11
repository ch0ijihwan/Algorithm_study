//https://www.acmicpc.net/problem/1978


import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sosuCount = 0;
        int count = 0;

        for (int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            sosuCount = 0;

            for (int j = 1; j <= num2; j++) {
                if (num2 % j == 0)// 자신보다 작은 수로 나워지면 소수가 아님.
                    sosuCount++;
            }

            if (sosuCount == 2) // 2는 1과 자기 자신을 의미. 2보다 크면 소수가 아님.
                count++;
        }
        System.out.print(count);
    }
}
