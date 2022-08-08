package before;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2751 {
    static int n = 0;
    static int[] arr = null;
    static int[] answer = null;

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

//        n = scanner.nextInt();
        arr = new int[n];
        answer = new int[n];

        for(int i=0;i<n;i++) {
//            arr[i] = scanner.nextInt();
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0,n-1);

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
            sb.append(arr[i] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    static void mergeSort(int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);

            int p = start;
            int q = mid+1;
            int idx = p;


            while(p <= mid || q <= end){
                if(q > end || p<= mid && arr[p] < arr[q]){
                    answer[idx++] = arr[p++];
                }else{
                    answer[idx++] = arr[q++];
                }

            }

            for(int i=start;i<=end;i++){
                arr[i] = answer[i];
            }
        }

    }

}
