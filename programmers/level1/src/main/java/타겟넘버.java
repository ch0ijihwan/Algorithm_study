//https://programmers.co.kr/learn/courses/30/lessons/43165
public class 타겟넘버 {
    public int solution(int[] input, int taget) {
        return dfs(input, taget, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int num) {
        if (index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return dfs(numbers, target, index + 1, num + numbers[index]) + dfs(numbers, target, index + 1, num - numbers[index]);
        }
    }
}
