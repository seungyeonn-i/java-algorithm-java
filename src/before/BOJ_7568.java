package before;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_7568 {
    static int n = 0;
    static int[][] arr = null;
    static int [] answer = null;
    static int count = 1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        arr = new int[n][2];
        answer = new int[n];

        for(int i=0;i<n;i++){

            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][0] < arr[j][0])
                    if(arr[i][1] < arr[j][1])
                        count ++;
            }

            answer[i] = count;
            System.out.println(answer[i]);
            count  = 1;
        }

    }


}
