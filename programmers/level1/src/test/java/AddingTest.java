import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingTest {
    private Adding adding = new Adding();

    @Test
    @DisplayName("절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 " +

            "boolean 배열 signs가 매개변수로 주어 졌을 때, 원래 수들을 더해 반환한다.")
    void test1() {
        //given
        int[] absolutes = new int[]{4, 7, 12};
        boolean[] signs = new boolean[]{true, false, true};
        int expect = 9;

        //when
        int actual = adding.solution(absolutes,signs);

        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 " +
            "boolean 배열 signs가 매개변수로 주어 졌을 때, 원래 수들을 더해 반환한다.")
    void test2() {
        int[] absolutes = new int[]{1, 2, 3};
        boolean[] signs = new boolean[]{false, false, true};
        int expect = 0;

        //when
        int actual = adding.solution(absolutes,signs);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}
