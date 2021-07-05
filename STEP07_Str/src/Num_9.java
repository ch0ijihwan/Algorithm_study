//2941

import java.util.Scanner;

public class Num_9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String input_str = sc.nextLine();


        int count = 0;

        for (int i = 0; i < input_str.length(); i++) {
            char ch1 = input_str.charAt(i);


            if (ch1 == 'c') { // 맨 마지막에 크로아티아 알파벳의 시작이 들어가면 i+1 할 때 인덱스 아웃 에러가 나기 때문에. 마지막 글자는 카운드 안해주기 위해 -1 을 해준다.
                if (i < input_str.length() - 1) {
                    if (input_str.charAt(i + 1) == '=') {
                        i++;
                    } else if (input_str.charAt(i + 1) == '-') {
                        i++;
                    }
                }

            } else if (ch1 == 'd') {
                if (i < input_str.length() - 1) {
                    if (input_str.charAt(i + 1) == 'z') {
                        if (i < input_str.length() - 2) {
                            if (input_str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }

                    else if(input_str.charAt(i+1)== '-'){
                        i++;
                    }
                }

            } else if (ch1 == 'l') {
                if (i < input_str.length() - 1) {
                    if (input_str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch1 == 'n') {

                if (i < input_str.length() - 1) {
                    if (input_str.charAt(i + 1) == 'j') {

                        i++;


                    }
                }
            } else if (ch1 == 's') {
                if (i < input_str.length() - 1) {
                    if (input_str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (ch1 == 'z') {
                if (i < input_str.length() - 1) {
                    if (input_str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            count++;
        }


        System.out.println(count);
    }
}
