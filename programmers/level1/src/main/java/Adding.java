public class Adding {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i]){
                answer = answer + absolutes[i];
            }
            if(!signs[i]){
                answer = answer - absolutes[i];
            }
        }
        return  answer;
    }
}
