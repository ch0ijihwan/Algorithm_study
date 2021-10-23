class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int countZero = 0;
        for (int i : lottos
        ) {
            for (int j : win_nums
            ) {
                if (i == j) {
                    count++;
                }
            }
            if (i == 0) {
                countZero++;
            }
        }
        int resultBest = 7 - (count + countZero) > 6 ? 6 : 7 - (count + countZero);
        int resultWorst = 7 - count > 6 ? 6 : 7 - count;
        return new int[]{resultBest, resultWorst};
    }
}