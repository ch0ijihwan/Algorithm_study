import java.util.Arrays;
import java.util.Scanner;

public class Num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[9];


        for (int i = 0; i < arr.length; i++) { // 배열에 지정한 수만큼 값을 받는다.
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; // 배열의 첫번째 요소를 각각 max에 넣어줌.
        int count = 0;


        for (int num : arr) { //최댓값을 찾는 부분
            if (num > max) {
                max = num;
            }
        }

        for (int i = 0; i < arr.length; i++) { // 몇번째 순서에 있는지 찾는 부분
            if(arr[i] == max){
                count = i+1; // index + 1

            }

        }

        System.out.println(max);
        System.out.println(count);


    }
}
