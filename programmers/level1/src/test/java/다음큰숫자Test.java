import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 다음큰숫자Test {
    private 다음큰숫자 A = new 다음큰숫자();

    @Test
    @DisplayName("78 입력시 83 반환")
    void test1()
    {
        //given
        int input = 78;
        int expect = 83;

        //when
        int actual = A.soultion(input);
    
        //then
        assertThat(actual).isEqualTo(expect);
    }
}