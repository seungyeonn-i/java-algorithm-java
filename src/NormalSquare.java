import java.math.BigInteger;

public class NormalSquare {

    public static void main(String[] args) {
        int w = 9;
        int h = 5;
        solution(w, h);
    }
    static long solution(int w, int h) {
        long answer = 1;

        BigInteger b1 = BigInteger.valueOf(w);
        BigInteger b2 = BigInteger.valueOf(h);
        BigInteger gcd = b1.gcd(b2);

        int bigNum = gcd.intValue();

        int wNum = w / bigNum;
        int hNum = h / bigNum;

        int line = wNum + hNum - 1;

        line *= bigNum;

        answer = w * h - line;

        System.out.println(answer);




        return answer;
    }

}
