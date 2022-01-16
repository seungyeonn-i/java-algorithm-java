
import java.util.Scanner;

public class BOJ_14889 {

    static void input() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        S = new int[N][N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                S[i][j] = scanner.nextInt();
            }
        }

        visit = new boolean[N];

        scanner.close();
    }


    static int N , Min = Integer.MAX_VALUE;
    static int[][] S;
    static boolean[] visit;


    static void backtracking(int idx , int count) {

        if(count == N / 2) {
            cal();
        }

        else {
            for(int i=idx;i<N;i++) {
                if(!visit[i]) {
                    visit[i] = true;
                    backtracking(i + 1 , count + 1);
                    visit[i] = false;
                }
            }
        }
    }


    static void cal() {
        int team_start = 0;
        int team_link = 0;

        for(int i=0;i<N-1;i++) {
            for(int j=i+1;j<N;j++) {
                if(visit[i] == true && visit[j] == true) {
                    team_start += (S[i][j] + S[j][i]);
                }
                else if(visit[i] == false && visit[j] == false) {
                    team_link += (S[i][j] + S[j][i]);
                }
            }
        }

        int val = Math.abs(team_link - team_start); //절댓값
        Min = Math.min(val , Min);
    }

    static void pro() {
        backtracking(0 , 0);
        System.out.println(Min);
    }



    public static void main(String[] args) {
        input();
        pro();
    }

}