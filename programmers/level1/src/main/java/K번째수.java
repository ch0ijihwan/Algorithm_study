import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class K번째수 {
    public int[] solution(int[] input_arr, int[][] input_rule) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input_rule.length; i++) {
            int[] arr = input_arr;
            int[] temp = Arrays.copyOfRange(arr, input_rule[i][0] - 1, input_rule[i][1]);
            Arrays.sort(temp);
            result.add(temp[input_rule[i][2] - 1]);
        }

        int[] answer = new int[result.size()];

        IntStream.range(0, result.size()).forEach(index -> answer[index] = result.get(index));
        return answer;
    }
}
