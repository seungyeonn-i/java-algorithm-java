import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,3,3};

        solution(arr);
    }

    static int[] solution(int[] arr) {

        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(arr).boxed().
                collect(Collectors.toList());

        int check [] = new int [3];

        for(int i=0;i<integerArray.size();i++){

            for(int j=1;j<4;j++){
                if(integerArray.get(i) == j) {
                    check[j-1] += 1;
                }
            }
        }

        int answer[] = new int[3];
        int max = check[0];

        for(int i=0;i<3;i++){
            if(max < check[i])
                max = check[i];
        }

        for(int i=0;i<3;i++){
            answer[i] = max - check[i];
            System.out.println(answer[i]);
        }

        return answer;

    }
}
