import java.util.Scanner;

public class Num_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();



        for (int i = 0; i < test_case; i++) {

            int re_num = sc.nextInt();
            String input_str = sc.next();

            for( String val : input_str.split("")){
                for (int j = 0; j < re_num; j++) {
                    System.out.printf("%s",val);//%s 사용이유 -> 그냥 출력하면 %같은 경우 출력 안됨.

                }

            }
            System.out.println();

        }

    }
}
