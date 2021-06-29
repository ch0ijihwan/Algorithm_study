import java.util.Scanner;

public class Num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int si = sc.nextInt();
        int bun = sc.nextInt();

        if (bun >= 45) {
            bun = bun - 45;

        } else if (bun < 45) {
            bun = 60 + (bun - 45); // 분을 빼주고 -1 곱해준 다음 60분에서 빼줌.
            if (si == 0) {
                si = 23;

            } else {
                si = si - 1;
            }

        }

        System.out.println(si+" "+ bun);
    }
}
