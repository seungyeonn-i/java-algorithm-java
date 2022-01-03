import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListofUniqueNumbers {
    public static void main(String[] args) {
        System.out.println(solution());

    }
    static long solution(){
        long answer = 0;

        FastReader scan = new FastReader();
        int N = scan.nextInt();

        int [] list = new int[N+1];
        for(int i=1;i<=N;i++){
            list[i] = scan.nextInt();
        }
        char [] cnt = new char[100000+1];

        //num 1
//        answer = N;
//        for(int i=0;i<N;i++){
//            for(int j=i+1;j<N;j++){
//                if(compare(list[i],list[j])) {
//                    if(j == N-1)
//                        answer--;
//                }else{
//                    System.out.print(list[i] + " " +list[j]);
//                    break;
//                }
//            }System.out.println();
//        }


        for(int L=1,R=0;L<=N;L++){
            //r을 옮길 수 있을만큼 옮김
            while(R+1 <= N && cnt[list[R+1]] == 0){
                R++;
                cnt[list[R]]++;
            }
            //정답 갱신
            answer += R - L+1;

            //l 옮기고 a[l] = 0
            cnt[list[L]]--;
        }

//        sc.close();
        return answer;

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
