
public class stringToInt {

    public static void main(String[] args) {

        String s = "23four5six7";

        System.out.println(solution(s));
    }


    public static int solution(String s) {
        int answer = 0;

        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String str = null;

        for(int i=1;i<10;i++){

            str = s.replace(num[i], Integer.toString(i));
            s = str;

        }

        try {
            answer = Integer.parseInt(str);
        }catch(NumberFormatException e){

        }

        return answer;

    }
}
