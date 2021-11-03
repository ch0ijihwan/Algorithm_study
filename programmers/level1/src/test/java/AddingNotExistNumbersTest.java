import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddingNotExistNumbersTest {
    private AddingNotExistNumbers addingNotExistNumbers;

    @Test
    @DisplayName("입력받은 배열에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하는지 확인.")
    void test1() {
        //given
        addingNotExistNumbers = new AddingNotExistNumbers();
        int[] input = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        int expect = 14;

        //when
        int actual = AddingNotExistNumbers.solution(input);

        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("입력받은 배열에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하는지 확인.")
    void test2() {
        //given
        addingNotExistNumbers = new AddingNotExistNumbers();
        int[] input = new int[]{5,8,4,0,6,7,9};
        int expect = 6;

        //when
        int actual = AddingNotExistNumbers.solution(input);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}