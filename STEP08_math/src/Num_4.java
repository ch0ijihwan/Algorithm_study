//2869

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num_4 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int up_dis = Integer.parseInt(st.nextToken());
        int down_dis = Integer.parseInt(st.nextToken());
        int high = Integer.parseInt(st.nextToken());

        int day = (high - down_dis) / (up_dis - down_dis);
        if ((high - down_dis) % (up_dis - down_dis) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
