import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PickTwoAndAddTest {
    private PickTwoAndAdd pickTwoAndAdd;
    private int[] input;
    private int[] expect;

    @Test
    @DisplayName("case1 : [2,1,3,4,1]입력시 [2,3,4,5,6,7]반환")
    void caseOnetest() {
        //given
        input = new int[]{2, 1, 3, 4, 1};
        pickTwoAndAdd = new PickTwoAndAdd(input);

        expect = new int[]{2, 3, 4, 5, 6, 7};
        //when
        int[] actual = pickTwoAndAdd.solution();

        //then
        assertThat(actual).isEqualTo(expect);
    }
}