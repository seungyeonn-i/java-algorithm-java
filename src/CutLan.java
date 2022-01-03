import java.util.Arrays;
import java.util.Scanner;

public class CutLan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N,K;

        N = sc.nextInt();
        K = sc.nextInt();
        int[] lines = new int [N];

        for(int i=0;i<N;i++){
            lines[i] = sc.nextInt();
        }
        System.out.println(cut(N, K, lines));
    }


    static int cut(int N, int K, int[] lines) {
        Arrays.sort(lines);

        int max = lines[0];
        int sum = 0;

        for(int j=0;j<N;j++){
            sum += lines[j] / (max/2+1);
        }


        if(sum < K) {
            max = max / 2-1;

            while (true) {
                sum = 0;

                for(int i=0;i<N;i++){
                    sum += lines[i] / max;
                }

                if (sum >= K) break;
                if(max == 1)   break;
                max --;

            }
        }
        else{
            max = max/2+1;
            while(true){
                sum = 0;

                for(int i=0;i<N;i++){
                    sum += lines[i] / max;
//                    System.out.print(lines[i]/max+ " ");
                }
//                System.out.println();

//                if (sum <= K) {
//                    break;
//                }
                if(max >= lines[0])   break;
                max ++;

            }
        }

        return max;

    }
}
