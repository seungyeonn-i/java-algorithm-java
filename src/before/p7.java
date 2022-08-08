package before;

public class p7 {

    public static void main(String[] args) {
        solution(3, 4);
    }

    static int[][] solution(int rows, int columns) {
            int[][] answer = {};

            int rm = 0;
            int cm = 0;

            int [][] result = new int [rows][columns];


            int num = 1;


            while(zero(result, rows,columns));

                if(rows != columns){
                    for(int i=0;i<rows*2;i++){
                        if(num%2 != 0){
                            if(cm == columns-1){
                                cm = -1;
                                result[rm][cm+1] = num+1;
                            }
                            else{
                                result[rm][cm+1] = num +1;

                            }

                        }
                        else{

                            if(rm== rows-1){
                                rm = -1;
                                result[rm+1][cm] = num+1;
                            }else{
                                result[rm+1][cm] = num+1;

                            }
                        }
                    }
                }

            return answer;
        }



        public static boolean zero(int[][] result, int rows, int colums){
        int change = 0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<colums;j++){
                    if(result[i][j] == 0){
                        change ++;
                    }
                }
            }
            if(change == rows*colums){
                return  false;
            }
           return true;
        }


    }

