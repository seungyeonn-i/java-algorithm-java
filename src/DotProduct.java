public class DotProduct {

    public void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -2, -1, 0};

        System.out.println(solution(a, b));
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(i==j)
                    answer += a[i]*b[j];
            }
        }
        return answer;
    }
}
