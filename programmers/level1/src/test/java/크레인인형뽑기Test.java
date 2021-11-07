import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 크레인인형뽑기Test {
    private 크레인인형뽑기 A = new 크레인인형뽑기();

    @Test
    @DisplayName("[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]] 격자 입력 후 " +
            "[1,5,3,5,1,2,1,4] 입력시 사라지는 인형 갯수 4 반환")
    void test() {
        //given
        int[][] inputBoard = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        int expect = 4;

        //when
        int actual = A.solution(inputBoard, moves);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}