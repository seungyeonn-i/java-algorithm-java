class August1Week {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i=1;i<=count;i++){
            sum += (long)(price*i);
        }

        if(sum < money){
            answer = 0;
        }
        else{
            answer = sum - money;
        }

        return answer;
    }
}