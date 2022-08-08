package before;

import java.util.Scanner;

public class DivideAndConquer {

    public static int n,white,blue;
    public static int [][] arr;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        arr = new int[n][n];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        partition(0, 0, n);

        System.out.println(white);
        System.out.println(blue);



    }

    static void partition(int row, int col, int size){

        if(colorCheck(row,col,size)){
            if(arr[row][col] == 0)  white ++;
            else    blue++;
            return ;
        }

        int newsize = size / 2;

        partition(row, col, newsize);
        partition(row + newsize, col, newsize);
        partition(row,col+newsize, newsize);
        partition(row + newsize, col + newsize, newsize);

    }

    static boolean colorCheck(int row, int col, int size){

        int std = arr[row][col];

        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(arr[i][j] != std)    return false;
            }
        }
        return true;
    }




}
