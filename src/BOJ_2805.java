import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_2805 {

    public static int n,m;
//    public static int[] trees;
    public static List<Integer> trees;
    public static int sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        trees = new ArrayList<>();

        for(int i=0;i<n;i++){
            trees.add(scanner.nextInt());
        }

        Collections.sort(trees);

        int index = 0;

        for(int i=0;i<n;i++){
            if(cut(trees.get(i))){
                index = i;

            }
        }

        for(int i=trees.get(index+1);i>trees.get(index);i--){

//            System.out.println(cal(i));
            if (m == cal(i)){
                System.out.println(i);
                break;
            }

        }

    }
    public static int cal(int std){


        int sum = 0;

        for(int i=0;i<n;i++){
            if(trees.get(i) > std)
                sum += trees.get(i) - std;
        }

        return sum;

    }

    public static boolean cut(int std){

        sum += cal(std);

        if(sum < m) return true;
        else    return false;

    }
}
