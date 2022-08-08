package before;

import java.util.ArrayList;
import java.util.List;

public class Carpet {

//    yellow one row
//    (x*2)+2(y-2) = brown
//    yellow +2 = x,

//    yellow + 2 = brown + yellow / y
//
//    but, yellow two row,
//    yellow/2 +2 = x;

//    and x > y

//    x*y = brown + yellow
//    x = brown + yellow /y




    public static void main(String[] args) {

        int brown = 10;
        int yellow = 2;
        solution(brown, yellow);


    }

    static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int num = brown + yellow;

        for (int i = 1; i <= num; i++) {
            int row = i;
            int col = num / row;

            if (row > col)
                continue;

            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }

        }

        return answer;
    }



}
