import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 타겟넘버Test {
    private 타겟넘버 tagetNumber = new 타겟넘버();
    
    @Test
    @DisplayName("배열 [1, 1, 1, 1, 1] 와 타겟 넘버 (3) 입력시 더하기와 빼기로 이 수들을 조합해 3이 나올 수 있는 경우의 수 반환")
    void test1()
    {
        //given
        int[] input = new int[]{1, 1, 1, 1, 1};
        int taget = 3;
        int expect = 5;
    
        //when
        int actual = tagetNumber.solution(input,taget);
        //then
        assertThat(actual).isEqualTo(expect);
    }
}