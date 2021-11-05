import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 오픈채팅방Test {
    private 오픈채팅방 A = new 오픈채팅방();

    @Test
    @DisplayName("[\"Enter uid1234 Muzi\", \"Enter uid4567 Prodo\",\"Leave uid1234\",\"Enter uid1234 Prodo\",\"Change uid4567 Ryan\"]" +
            "입력시 [\"Prodo님이 들어왔습니다.\", \"Ryan님이 들어왔습니다.\", \"Prodo님이 나갔습니다.\", \"Prodo님이 들어왔습니다.\"]\n 반환" +
            "")
    void test() {
        //given
        String[] input = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] expect = new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        //when
        String[] actual = A.solution(input);

        //then
        assertThat(actual).isEqualTo(expect);
    }
}