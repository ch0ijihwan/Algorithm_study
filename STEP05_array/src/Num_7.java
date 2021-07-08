import java.util.Locale;
import java.util.Scanner;

public class Num_7 {
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);

        int tester_case = sc.nextInt();//총 몇번 테스트 할지 입력
        int [] arr;



        for (int i = 0; i <tester_case ; i++) {// 테스트 횟수 만큼 반복
            double sum =0.0;
            int n = sc.nextInt(); //몇명의 학생수를 테스트 할지 입력
            arr = new int [n];


            for (int j = 0; j < n; j++) {//각각 성적 값을 받음
                int score = sc.nextInt();
                arr[j] = score;
                sum+=score;

            }

            double avg = sum/n;
            double over_avg_num_count = 0.0;

            //평균 넘는 비율

            for (int j = 0; j < n; j++) {
                if (arr[j]>avg){
                    over_avg_num_count++;
                }
            }

            System.out.printf("%.3f%%\n",(over_avg_num_count/n)*100);


        }
        sc.close();
    }
}
