//https://programmers.co.kr/learn/courses/30/lessons/86051
public class AddingNotExistNumbers {

    public static int solution(int[] input) {
        int checker = 45;

        for (int i = 0; i < input.length; i++) {
            checker = checker - input[i];
        }

        return checker;
    }
}
