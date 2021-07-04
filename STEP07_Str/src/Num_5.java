//1157
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input_str = sc.next();

        input_str = input_str.toUpperCase();//모두다 대문자로 바꿔줌.


        int [] alpha = new int[26];


        for (int i = 0; i < input_str.length(); i++) {

              alpha[ input_str.charAt(i)-'A' ] ++;//각각 문자에 해당하는 알파벳이 있으면 그 인덱스의 값을 올려쥼.
            // 'A'를 빼준 이유 -> 유니코드 값이 넘어가기 때문에 'A'를 빼줘서 인덱스에 해당하는 알파벳 카운트가 들어가게함.

        }



        int max = -1;
        char c = '?';

        for (int i = 0; i < 26; i++) {
            if(alpha[i]>max){
                max = alpha[i];
                c = (char) (i+'A');

            }
            else if(alpha[i] == max ){
                c = '?';
            }

        }
        System.out.println(c);


    }
}
