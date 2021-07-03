import java.util.Arrays;
import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

       int [] arr = new int[number];


        for (int i = 0; i < number; i++) { // 배열에 지정한 수만큼 값을 받는다.
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; // 배열의 첫번째 요소를 각각 max,와 min에 넣어줌.
        int min = arr[0];

        for (int num : arr){
            if(num>max) max = num;
            if(num<min ) min = num;
        }

        System.out.printf(min +" "+ max);

    }
}
