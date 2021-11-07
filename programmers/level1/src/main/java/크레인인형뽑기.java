import java.util.Stack;

public class 크레인인형뽑기 {
    public int solution(int[][] inputBoard, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int count = 0;

        for (int i = 0; i < moves.length; i++) {
            int po_index = moves[i] - 1;

            for (int j = 0; j < inputBoard.length; j++) {
                if (0 != inputBoard[j][po_index]) {
                    if (stack.peek() == inputBoard[j][po_index]) {
                        stack.pop();
                        count = count + 2;
                    } else {
                        stack.push(inputBoard[j][po_index]);
                    }
                    inputBoard[j][po_index] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
