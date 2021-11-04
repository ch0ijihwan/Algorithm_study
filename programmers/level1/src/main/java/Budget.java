import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12982
public class Budget {
    public int solution(int budget, int[] d) {
        int total = 0;
        int [] numbers = Arrays.stream(d).sorted().toArray();

        for (int i = 0; i < numbers.length; i++) {
            total = numbers[i] + total;
            if (total > budget) {
                return i;
            }
        }
        return d.length;
    }
}
