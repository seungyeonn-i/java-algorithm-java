package before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1010 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<a;i++){

            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] dp = new int[n+1][m+1];

            //1행 값 세팅
            for(int j=1;j<m+1;j++){
                dp[1][j] = j;
            }

            //n==m 이면 1로 세팅
            for(int j=1;j<n+1;j++){
                for(int k=0;k<m+1;k++){
                    if(j==k)
                        dp[j][k] = 1;
                }
            }

            //dp
            for(int j=2;j<n+1;j++){
                for(int k=j+1;k<m+1;k++){
                    dp[j][k] = dp[j - 1][k - 1] + dp[j][k - 1];
                }
            }
            sb.append(dp[n][m]).append('\n');
        }
        System.out.println(sb);

    }

}
