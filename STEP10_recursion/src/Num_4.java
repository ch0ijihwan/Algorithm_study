//https://www.acmicpc.net/problem/11729

public class Num_4 {
    public static void main(String[] args) {

    }

    public static void hanoi(int n, int A = 1, int B = 2;){

        if(n == 1){
            return;
        }
        else{
            hanoi( n - 1);
            System.out.println();


        }


    }
}


/*
void hanoiTower(int n, char from, char tmp, char to) {
	if (n == 1)cout << "원판1을 " << from << "를 " << to << "으로 옮긴다." << endl;
	else {
		hanoiTower(n - 1, from, to, tmp);
		cout << "원판" << n << "을(를) " << from << "에서 " << to << "으로 옮긴다." << endl;
		hanoiTower(n - 1, tmp, from, to);
	}
}
 */