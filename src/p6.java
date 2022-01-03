public class p6 {
//출발 시간은 금요일이 기준이며, 도착 시간은 다음 월요일이 기준입니다.
    public static void main(String[] args) {

        double time = 3.5;
        String  [][] plans  = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};
        solution(time,plans);
    }

    static String solution(double time, String[][] plans) {
        String answer = "";

        int mon_gotowork = 13;
        double fri_gotowork =9.5;
        int offwork = 18;

        int[][] t = new int[2][2];

        for(int i=0;i<plans.length;i++) {

//            t[0][0] = Integer.parseInt(plans[i][1].substring(0,1));
            t[0][0] = Integer.parseInt(plans[i][1].replaceAll("[^0-9]", ""));

            if(plans[i][1].indexOf("PM") != -1){
                t[0][0] += 12;
            }


            t[0][1] = Integer.parseInt(plans[i][2].replaceAll("[^0-9]", ""));


            if(plans[i][2].indexOf("PM") != -1){
                t[0][1] += 12;
            }
        }

        double a=time;
        for(int i=0;i<plans.length;i++){
            System.out.println(plans[i][0]);

            if( offwork > t[i][0]) {
                a -= (offwork - t[i][0]);
                if ( a < 0 ){
                    continue;
                }
                answer = plans[i][0];

            }

            if(mon_gotowork < t[i][1]){
                a -= (mon_gotowork - t[i][0]);

                if ( a < 0 ){
                    continue;
                }
                answer = plans[i][0];
            }



        }

        System.out.println(answer);


        return answer;
    }
}

