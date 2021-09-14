import java.util.Scanner;

public class a {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        for(int i =0; i<num ; i++) {
            for(int j=num; 0<i;j--) {

                System.out.print("*");
            }

            System.out.println("\n");
        }
    }


    static void change(int a[]){
        a[0] = 3;
        a[3] = 9;
    }
}

