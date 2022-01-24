import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1966 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int n,m,count;

        for(int i=0;i<total;i++){
            LinkedList<int[]> queue = new LinkedList<>();
            count = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();

            for(int j=0;j<n;j++)
                queue.add(new int[] {j,scanner.nextInt()});

            while(!queue.isEmpty()){    // 다 검사
                int[] now = queue.poll();
                boolean able = true;

                for(int [] q : queue)
                    if(q[1] > now[1])   //더 중요한게 있다면
                        able = false;
                    if(able){
                         count ++;
                         if(now[0] == m)    break;
                    }
                    else
                        queue.add(now);
            }
            System.out.println(count);

        }




    }
}
