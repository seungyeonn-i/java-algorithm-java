import java.util.Scanner;

public class BOJ_1932 {
    static int n,m;
    static int sum;
    static int max;
    static int [][] arr;
    static Integer [][] dp;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n][n];
        dp = new Integer[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            dp[n-1][i] = arr[n-1][i];
        }

        System.out.println(dp(0,0));

    }
    public static int dp(int depth, int index){

        if(depth == n-1)    return dp[depth][index];

        if(dp[depth][index] == null){
            dp[depth][index] = Math.max(dp(depth + 1, index), dp(depth + 1, index + 1)) + arr[depth][index];
        }

        return dp[depth][index];

    }


}
