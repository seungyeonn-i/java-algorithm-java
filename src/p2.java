import java.util.ArrayList;
import java.util.Arrays;

public class p2 {

    public static void main(String[] args) {
        String[] log = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
        solution(log);
    }

     static String solution(String[] log) {
        String answer = "";
         ArrayList<String> time = new ArrayList<String>(Arrays.asList(log));

         ArrayList<Integer> timelist = new ArrayList<Integer>();

         while(true) {

             if(time.isEmpty()){
                 break;
             }

             int start_hour = Integer.parseInt(time.get(0).substring(0,2));
             int start_minute = Integer.parseInt(time.get(0).substring(3, 5));
             int start_alltime = start_hour * 60 + start_minute;

             int end_hour = Integer.parseInt(time.get(1).substring(0, 2));
             int end_minute = Integer.parseInt(time.get(1).substring(3, 5));
             int end_alltime = end_hour * 60 + end_minute;

             time.remove(0);
             time.remove(0);

             if(end_alltime-start_alltime > 105) {
                 timelist.add(105);
                 continue;
             }
             if(end_alltime-start_alltime < 5) {
//                 timelist.add(0);
                 continue;
             }

             timelist.add(end_alltime-start_alltime);
         }

         int sum = 0;
         for(int i=0;i<timelist.size();i++){
             sum += timelist.get(i);
         }

         int answer_hour = sum / 60 ;
         int answer_minute = sum % 60;

         if(answer_hour<10)
             answer = String.format("%0d:%d", answer_hour, answer_minute);
        else
             answer = String.format("%d:%d", answer_hour, answer_minute);


         System.out.println(answer);


        return answer;
    }
}

