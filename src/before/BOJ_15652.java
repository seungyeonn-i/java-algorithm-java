package before;

import java.util.Scanner;

public class BOJ_15652 {
    static int n,m;

    static int [] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();


        arr = new int[m];
        dfs(0,0);
        System.out.println(sb);

    }

    public static void dfs(int depth,int N){

        if(depth == m){
            for(int val : arr){
                sb.append(val + " ");
            }
            sb.append('\n');
            return ;
        }


        for(int i=N;i<n;i++){


            arr[depth] = i+1;
            dfs(depth + 1,i);
        }



    }
}
