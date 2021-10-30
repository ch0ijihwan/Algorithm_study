class returnOfChange {
    public static int[] solution(int money) {
        int[] result = new int[9];
        int[] kindOfMoney = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < kindOfMoney.length; i++) {
            result[i] = money / kindOfMoney[i];
            money = money - (result[i] * kindOfMoney[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int money = 65432;
        int[] result = solution(money);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}



