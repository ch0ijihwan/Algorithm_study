import java.util.Arrays;

public class 완주하지못한선수 {
    public String solution(String[] participation_list, String[] completion_list) {
        Arrays.sort(participation_list);
        Arrays.sort(completion_list);

        int i;

        for (i = 0; i < completion_list.length; i++) {
            if (!participation_list[i].equals(completion_list[i])) {
                return participation_list[i];
            }
        }
        return participation_list[i];

    }
}
