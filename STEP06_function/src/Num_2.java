public class Num_2 {
    public static void main(String[] args){	// 메인

        boolean [] check_arr = new boolean[10001];

        for (int i = 1; i < 10001; i++){
            int n = d(i);

            if(n<   10001){ //10000보다 작은 값이 오면 true
                check_arr[n] = true;

            }
        }


        //생성자가 없는, 즉 Check_arr 중 false값을 가진 인덱스를 뽑아주면 된다.

        for (int i = 1; i < check_arr.length; i++) {
            if(!check_arr[i]){
                System.out.println(i);
            }
        }


    }

    public static int d(int number) {	// 함수
        int sum = number;// 맨처음에 sum에 자기 자신을 넣고, 밑에 while에서 각 자릿수를 더 해준다.

        while (number !=0 ){  //각 자리수를 하나씩 뽑아서 sum에 더해주는 부분

            sum = sum + (number % 10); //첫번째의 자리수 뽑기
            number = number/10; //10으로 나누어 첫재 자리를 없앤다.

        }
        return sum;

    }
}
