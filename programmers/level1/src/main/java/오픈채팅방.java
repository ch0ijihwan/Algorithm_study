import java.util.HashMap;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < record.length; i++) {
            if (record[i].charAt(0) == 'L') {
                continue;
            } else if (record[i].charAt(0) == 'C') {
                count++;
            }
            map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
        }

        String[] result = new String[record.length - count];
        int index = 0;

        for (int i = 0; i < record.length; i++) {

            if (record[i].charAt(0) == 'E') {
                result[index++] = map.get(record[i].split(" ")[1]) + "님이 들어왔습니다.";
            } else if (record[i].charAt(0) == 'L') {
                result[index++] = map.get(record[i].split(" ")[1]) + "님이 나갔습니다.";
            }
        }
        return result;
    }
}
