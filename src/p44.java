public class p44 {

    public static void main(String[] args) {
        solution("aabbaaa");
    }

    static int[] solution(String s) {
        int[] answer = {};

        int [] check = new int [s.length()];

        int index=0;
        for(int i=0;i<s.length()/2;i++){

            if(s.charAt(i) == (s.charAt(i+1))){
                check[index] += 1;
            }
            else if(s.charAt(i) != s.charAt(i+1)){
                index++;
            }
        }

        for(int i=0;i<check.length;i++){
            System.out.println(check[i]);
        }




        return answer;
    }
}


