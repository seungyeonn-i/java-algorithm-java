package before;

public class Lotto {

    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        solution(lottos, win_nums);

    }
    static int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];

        int count = 0;
        int chance = 0;


        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<win_nums.length;j++){

                if(lottos[i] == win_nums[j]){
                    count++;
                }
            }
            if(lottos[i] == 0){
                chance++;
            }
        }
        answer[0] = rank[chance + count];
        answer[1] = rank[count];


        return answer;

    }
}
