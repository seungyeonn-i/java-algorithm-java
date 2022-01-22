import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();

        arr.add(0);

        for(int i=0;i<n;i++){

            StringTokenizer st = new StringTokenizer(br.readLine(),"\n");

            int input = Integer.parseInt(st.nextToken());


            if(input == 0) arr.remove(arr.size()-1);
            else{
                arr.add(input);
            }


        }

        int sum = 0;

        for(int i=0;i<arr.size();i++){

            sum += arr.get(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);

    }
}
