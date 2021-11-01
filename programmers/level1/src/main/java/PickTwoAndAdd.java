import java.util.HashSet;
import java.util.Set;

public class PickTwoAndAdd {
    private int[] numbers;


    public PickTwoAndAdd(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] solution() {
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            {
                for (int j = i + 1; j < numbers.length; j++) {
                    temp.add(numbers[i] + numbers[j]);
                }
            }
        }
        return temp.stream().sorted().mapToInt(Integer::intValue).sorted().toArray();
    }
}
