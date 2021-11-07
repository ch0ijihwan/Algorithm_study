import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class K번째수Test {
    private K번째수 A = new K번째수();
    
    @Test
    @DisplayName("[1, 5, 2, 6, 3, 7, 4]배열과 [[2, 5, 3], [4, 4, 1], [1, 7, 3]] 입력시" +
            "첫번째 입력 배열을 2번째 배열의 형태에 맞게 자르고, 원하는 번째의 값을 반환하는지 확인" +
            "     [5, 6, 3]반환 " +
            "ex" +
            "[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.\n" +
            "[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.\n" +
            "[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.")
    void  test()
    {
        //given
        int [] input_arr = new int[] {1, 5, 2, 6, 3, 7, 4};
        int [][] input_rule = new int[][]{
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        int[] expect = new int [] {5,6,3};
    
        //when
        int[] actual = A.solution(input_arr,input_rule);

        //then
        assertThat(actual).isEqualTo(expect);
    }

}