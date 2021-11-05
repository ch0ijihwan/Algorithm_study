import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 중복제거Test {
    private 중복제거 A = new 중복제거();

    @Test
    @DisplayName("zyelleyz 입력시 연속 되는 문자열 중복을 계속 제거하여  \"\" 반환")
    void test() {
        //given
        String input = "zyelleyz";
        String expect = "";

        //when
        String actual = A.solution(input);

        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("browoanoommnaon 입력시 연속 되는 문자열 중복을 계속 제거하여  brown 반환")
    void test2() {
        //given
        String input = "browoanoommnaon";
        String expect = "brown";

        //when
        String actual = A.solution(input);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}