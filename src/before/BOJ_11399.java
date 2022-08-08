package before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_11399 {
    static int n;
    static List<Integer> arr ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new ArrayList<>();


        for(int i=0;i<n;i++){
            arr.add(scanner.nextInt());

        }

        Collections.sort(arr);
        int sum = 0;
        int before = 0;
        for(int i=0;i<arr.size();i++){
            if(i==0){
                sum += (0 + arr.get(i));
                before += arr.get(i);
            }
            else{

                sum += (before + arr.get(i));
                before += arr.get(i);
            }
        }

        System.out.println(sum);

    }
}
