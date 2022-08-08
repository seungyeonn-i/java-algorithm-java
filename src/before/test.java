package before;

import java.util.Arrays;

public class test {

    private static int answer = 0;

    public static void main(String[] args) {

        String numbers = "17";
        System.out.println(solution(numbers));

    }
    static int solution(String numbers) {

        int bigNum;

        int[] number = new int[numbers.length()];
        boolean[] visited = new boolean[number.length];

        bigNum = Integer.parseInt(numbers);

        //split numbers
        for(int i=0;i<numbers.length();i++){

            if(i == numbers.length() -1 ){
                number[i] = (int) (bigNum%Math.pow(10,i));
            }

            number[i] = (int) (bigNum/Math.pow(10,numbers.length()-i-1));
            bigNum =  bigNum%(int)Math.pow(10,numbers.length()-i-1);

        }

        for(int r=1;r<=number.length;r++){
            per1(number,0,number.length,r,r);
        }

        return answer;
    }



    static void per1(int[] arr, int depth, int n, int r,int rr) {
        if(depth == r) {
            cal(print(arr, r,rr));
            return;
        }

        for(int i = depth; i < n; i++) {
            swap(arr, depth, i);
            per1(arr, depth + 1, n, r,rr);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) { //두 배열의 값을 바꾸는 Swap 함수
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    static int print(int[] arr, int r,int rr) {
        int num = 0;
        for(int i = 0; i < r; i++) {
            num += arr[i] * Math.pow(10, rr-1);
            rr -= 1;
        }

        return num;
    }

    public static void cal(int n){

        if(n == 0) return;
        if(n == 1) return;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return;
        }
        answer++;
    }
}
