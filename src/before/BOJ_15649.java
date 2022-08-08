package before;

import java.util.Scanner;

public class BOJ_15649 {

    static int n,m;
    static boolean[] visit;
    static int[] arr;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        visit = new boolean[n];
        arr = new int[m];
        dfs(0);


    }

    public static void dfs(int depth){

        if(depth == m){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();

            return ;
        }

        for(int i=0;i<n;i++){
            if(visit[i] == false){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);

                visit[i] = false;   //visit arr reset
            }
        }
        return ;



    }


}
