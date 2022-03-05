import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_15651 {
    //같은 수를 여러번 골라도 된다.
    //모든 상태 공간 트리 순회

    static int n,m;
    static boolean [] visit;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

//        visit = new boolean[n];
        arr = new int[m];
        dfs(0);
        System.out.print(sb);


    }
    public static void dfs(int depth){

        if(depth == m){
            for(int val : arr){
               sb.append(val + " ");
            }
            sb.append('\n');
            return ;
        }

//        for(int i=N;i<m;i++){
            for(int j=0;j<n;j++){
                arr[depth] = j+1;
                dfs(depth + 1);

            }

//        }
        return ;
    }

    public static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st == null || st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

    }
}
