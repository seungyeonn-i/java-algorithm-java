package before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockTest {

    public static void main(String[] args) {

        int [] answers = {1,2,3,4,5};
        solution(answers);
    }

    static int[] solution(int[] answers) {

        int[] answer = {};

        int first = 0;
        int second = 0;
        int third = 0;

        int[] check = new int[3];

        int [][] patterns = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        for(int i=0;i<answers.length;i++){
            if(answers[i] == patterns[0][i%5])
                check[0]++;
            if(answers[i] == patterns[1][i%8])
                check[1]++;
            if(answers[i] == patterns[2][i%10])
                check[2]++;
        }

        System.out.println(Arrays.toString(check));

        List<Integer> maxIndex = new ArrayList<>();

        int [] checkcopy = new int[3];
        checkcopy = check.clone();


        Arrays.sort(checkcopy);
        int max = checkcopy[2];

        System.out.println(max);

        for(int i=0;i<3;i++){
            if(max == check[i]) {
                maxIndex.add(i+1);
            }
        }
        answer = maxIndex.stream().mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}


