public class BOJ_9663 {

    static int N,cnt;
    static int[] cal;
    static boolean attackable(int r1,int c1, int r2,int c2){
        if(c1 == c2)    return true;    //같은 열에 있다
        if(r1-c1 == r2-c2)  return true;    //행+열 값이 같으면 같은 오른쪽 대각선 상에 있다
        if(r1+c1 == r2+c2)    return true;    //행-열 값이 같으면 왼쪽 대각선 상에 있다
        return false;
    }
    static boolean promising(){
        for(int i=1;i<N;i++){
//            (i), col[i])
            for(int j=1;j<i;j++){
//                (j,col[j])
                if(attackable(i,cal[i],j,cal[j])){
                    return false;
                }
            }
        }
        return true;
    }
    static void rec_func(int row){
        if(row == N + 1){
//            if(promising()){ -> timebump
                cnt++;
            }else{
                for(int c = 1;c<=N;c++){
                    boolean possible = true;
//                    promising()
                    for(int i=1;i<=row-1;i++) {
                        if (attackable(row, c, i, cal[i])) {
                            possible = false;
                            break;
                        }
                    }
                    if(possible) {
                        cal[row] = c;
                        rec_func(row + 1);
                        cal[row] = 0;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
//        input();
        rec_func(1);
        System.out.println(cnt);
    }
}
