import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BudgetTest {
    private  Budget budget;

    @Test
    @DisplayName("예산 금액 리스트를 받아, 최대 몇 개의 부서에 물품을 지원할 수 있는지 반환")
    void test1 ()
    {
        budget = new Budget();
        //given
        int [] input = new int[]{1,3,2,5,4};
        int input_Budget = 9;
        int expect = 3;

        //when

        int actual = budget.solution(input_Budget, input);

        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("예산 금액 리스트를 받아, 최대 몇 개의 부서에 물품을 지원할 수 있는지 반환")
    void test2 ()
    {
        budget = new Budget();
        //given
        int [] input = new int[]{2,2,3,3};
        int input_Budget = 10;
        int expect = 4;

        //when
        int actual = budget.solution(input_Budget,input);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}