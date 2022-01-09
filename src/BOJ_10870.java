import java.util.Scanner;

public class BOJ_10870 {

    static int n = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(Fibo(n));

    }
    static int Fibo(int n){
        if (n <= 1)
            return n;
        else
            return Fibo(n-1 ) + Fibo(n-2);
//            return Fibo(n-1) + Fibo(n-2);
    }

}
