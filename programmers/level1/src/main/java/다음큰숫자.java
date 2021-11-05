//https://programmers.co.kr/learn/courses/30/lessons/12911
import java.util.Arrays;
public class 다음큰숫자 {
    public int soultion(int number) {

        String bi = Integer.toBinaryString(number);
        int count = (int) Arrays.stream(bi.split("")).filter(v -> v.equals("1")).count();
        int next = number;

        while (true) {
            String next_bi = Integer.toBinaryString(next);
            int next_count = (int) Arrays.stream(next_bi.split("")).filter(v -> v.equals("1")).count();

            if(next_count == count && next>number){
                break;
            }
            next++;
        }
        return next;
    }
}
