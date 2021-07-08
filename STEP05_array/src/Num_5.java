import java.util.Arrays;
import java.util.Scanner;

public class Num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int class_num = sc.nextInt();

        Double [] score = new Double [class_num];
        Double max = score[0]; //초기값으로 0번째 인덱스를 최댓값으로 설정

        Double sum = 0.0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
            sum = sum + score[i];
        }


        Arrays.sort(score);

        max = score[score.length-1];


        double avg = sum / max * 100 / score.length;

        System.out.println(avg);



    }
}
