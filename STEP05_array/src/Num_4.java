import java.util.HashSet;
import java.util.Scanner;

public class Num_4 {
    public static void main(String[] args) {

        int [] numbers = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i]%42;
        }


        HashSet <Integer> set = new HashSet <Integer>(); //HashSet 생성

        for (int num:numbers) { //배열의 값들을 set에 넣어줌
            set.add(num);
        }

        //set의 갯수 출력
        System.out.println(set.size());




    }
}
