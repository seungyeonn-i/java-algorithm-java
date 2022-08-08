package before;

import java.util.Scanner;

public class BOJ_2606 {

    static boolean[] visited ;
    static int [][] map;
    static int virus = 0;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        map = new int[n + 1][n + 1];    //인접 행렬 그래프
        visited = new boolean[n + 1];   //방문 여부 배열

        for(int i=0;i<m;i++){           //인접 행렬로 방문 여부 저장
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map[a][b] = map[b][a] = 1;

        }

        dfs(n, 1);

        System.out.println(virus-1);    //1번 컴퓨터 빼고


    }

    static void dfs(int n, int k){

        //dfs : 분할과 재귀

        //n : 전체 컴퓨터 개수
        //k : 방문 할 컴퓨터

        if(visited[k] == true)  return ;    //방문 한 적 있으면 ㅃㅇ

        visited[k] = true;                  //방문 등록 완료
        virus++;

        for(int i=0;i<map[k].length;i++){   //이제 그 다음, 인접 행렬 둘러보기
            if(map[k][i] == 1 && !visited[i])   // 해당 인접 행렬, 방문 한 적 없으면 ㄲㄲ
                dfs(n,i);
        }

        //이게 더 직관적인데 틀림
//        for(int i=0;i<n;i++){
//            if(visited[i] == false && map[k][i] == 1){
//                visited[i] = true;
//                dfs(n, i);
//                virus++;
//            }
//        }



    }
}
