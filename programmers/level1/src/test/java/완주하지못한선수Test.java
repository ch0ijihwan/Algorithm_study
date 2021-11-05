import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 완주하지못한선수Test {
    private 완주하지못한선수 A = new 완주하지못한선수();
    @Test
    @DisplayName("완주자 명단 배열과 마라톤 참가 선수 배열을 입력받아, 완주하지 못한 1명의 이름을 반환")
    void test() {
        //given

        String[] Participation_list = new String[]{"leo", "kiki", "eden"};
        String[] Completion_list = new String[]{"leo","eden"};
        String expect = "kiki";

        //when
        String actual = A.solution(Participation_list, Completion_list);

        //then
        assertThat(actual).isEqualTo(expect);
    }


    @Test
    @DisplayName("완주자 명단 배열과 마라톤 참가 선수 배열을 입력받아, 완주하지 못한 1명의 이름을 반환")
    void test2() {
        //given

        String[] Participation_list = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] Completion_list = new String[]{"josipa", "filipa", "marina", "nikola"};
        String expect = "vinko";

        //when
        String actual = A.solution(Participation_list, Completion_list);

        //then
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("완주자 명단 배열과 마라톤 참가 선수 배열을 입력받아, 완주하지 못한 1명의 이름을 반환")
    void test3() {
        //given

        String[] Participation_list = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] Completion_list = new String[]{"stanko", "ana", "mislav"};
        String expect = "mislav";

        //when
        String actual = A.solution(Participation_list, Completion_list);

        //then
        assertThat(actual).isEqualTo(expect);
    }

}