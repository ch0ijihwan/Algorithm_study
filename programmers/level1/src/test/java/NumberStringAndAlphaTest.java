import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberStringAndAlphaTest {
    private NumberStringAndAlpha numberStringAndAlpha;
    
    @Test
    @DisplayName("one4seveneight 입력 시 1478 반환")
    void test ()
    {
        //given
        numberStringAndAlpha = new NumberStringAndAlpha();
        String input_str = "one4seveneight";
        int expect = 1478;
    
        //when
        int actual = numberStringAndAlpha.solution(input_str);
    
        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName(" 23four5six7 입력 시 234567 반환")
    void test2 ()
    {
        //given
        numberStringAndAlpha = new NumberStringAndAlpha();
        String input_str = "23four5six7";
        int expect = 234567;

        //when
        int actual = numberStringAndAlpha.solution(input_str);

        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName(" 123 입력 시 123 반환")
    void test3 ()
    {
        //given
        numberStringAndAlpha = new NumberStringAndAlpha();
        String input_str = "123";
        int expect = 123;

        //when
        int actual = numberStringAndAlpha.solution(input_str);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}