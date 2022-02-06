import java.util.Scanner;

public class BOJ_2630 {

    public static int white = 0;
    public static int blue = 0;
    public static int [][] arr;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        arr = new int[n][n];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        partition(0,0,n);

        System.out.println(white);
        System.out.println(blue);


    }

    static void partition(int row, int col, int size){

        if(colorCheck(row,col,size)){
            if(arr[row][col] == 0){
                white++;
            }
            else{
                blue++;
            }
            return ;
        }

        int newSize = size/2;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);



    }
    public static boolean colorCheck(int row, int col, int size){
        //해당 파티션이 같은 색깔인지
        int first = arr[row][col];

        for(int i=row;i<row + size;i++){
            for(int j=col; j<col + size;j++){
                if(arr[i][j] != first){
                    return false;
                }
            }
        }
        return true;
    }


}
