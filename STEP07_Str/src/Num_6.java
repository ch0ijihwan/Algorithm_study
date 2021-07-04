
import java.util.Scanner;

public class Num_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        
        

        String no_blank_str = str.trim();//문자열의 좌우에 공백을 없앰.



        if(no_blank_str.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(no_blank_str.split(" ").length);
        }
    }
}
