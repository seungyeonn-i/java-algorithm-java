package before;

import java.util.ArrayList;
import java.util.Stack;

public class CraneGame {

    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0, count = 0;
        int check = 0;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < moves.length; i++) {

            for (int j = 0; j < board.length; j++) { //맨 위의 것

                if (board[j][(moves[i] - 1)] != 0) {

                    stack.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1]= 0;
                    count++;

                    if (stack.size() > 1) {

                        if (stack.get(stack.size() - 1) == stack.get(stack.size() - 2)) {

                            //remove && answer ++;

                            stack.pop();
                            stack.pop();
                            answer += 2;
                        }
                    }
                    break;

                }

            }
        }
        return answer;
    }
}

//        for (int i = 0; i < moves.length; i++) {
//
//            for (int j = 0; j < board[moves[i] - 1].length; j++) { //맨 위의 것
//
//                if (board[moves[i] - 1][j] != 0) {
//                    result.add(board[moves[i] - 1][j]);
//                    board[moves[i] - 1][j] = 0;
//                    count ++;
//
//                    if(count > 1) {
//
//                        if (result.get(result.size()-1) == result.get(result.size() - 2)) {
//
//                            //remove && answer ++;
//                            result.remove(result.size()-1);
//                            result.remove(result.size() - 2);
//                            answer += 2;
//                        }
//                    }
//                }
//
//            }

//        }
//        return answer;




//        for (int i = 0; i < moves.length - 1; i++) {
//            for (int j = 0; j < board.length; j++) {
//                if(board[i])
//            }
//            System.out.println(i);
//
//            result.add(board[i][board[i].length - 1]);  //세로줄의 마지막
//
//            if (answer > 1) {
//
//                if (result.get(i) == result.get(i - 1)) {
//
//                    //remove && answer ++;
//                    result.remove(i);
//                    result.remove(i + 1);
//
//                    answer++;
//                }
//
//            }

//        for(int i=0;i<moves.length;i++){

//            System.out.println(newBoard.get(13));
//            result.add(newBoard.get(moves.get[i][newBoard.size()-1]);


//             if(answer >1) {
//                 if (result.get(i) == result.get(i-1)) {
//
//                     //remove && answer ++;
//                     result.remove(i);
//                     result.remove(i + 1);
//
//                     answer++;
//                 }
//             }
//        }




