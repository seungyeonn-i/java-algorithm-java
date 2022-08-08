package before;

import java.util.*;

public class FailureRate {

    public static void main(String[] args) {

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3};

        int [] answer = solution(N, stages);

        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }

        static int[] solution(int N, int[] stages) {
            int[] answer = {};

            float [] failure = new float[N+1];

            Map<Integer, Integer> map = new HashMap<>();


            for(int i=0;i<stages.length;i++){
                int j = stages[i];
                failure[j-1] += 1;
//                map.put(j-1,map.get(i-1) + 1);
            }

            float person = stages.length;

            for(int i=0;i<failure.length;i++){

                person = person - failure[i];
                failure[i] = failure[i] / N ;
//                System.out.println(failure[i]);

            }
            int tmp;

            Arrays.sort(failure);

            for(int i=0;i<N+1;i++){
//
//                person = person - failure[i];
//                failure[i] = failure[i] / N ;
                System.out.println(failure[i]);
//
            }


//            answer = failure;



//            Map<Integer,Integer> failure = new HashMap<>();
//
//
//            for(int i=0;i<stages.length;i++){
//
//                    int j = stages[i];
//                    failure.put(j, failure.get(i) + 1);
//                    System.out.println("check");
//
//            }
//
//
//            for (Map.Entry<Integer, Integer> entrySet : failure.entrySet()) {
//                System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//            }

//            List<Map.Entry<Integer,Integer>> entryList = new ArrayList<Map.Entry<Integer,Integer>>(failure.entrySet());
//
//            Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
//                @Override
//                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                    return o2.getValue().compareTo(o1.getValue());
//                }
//            });
//
//            int i=0;
//
//            for(Map.Entry<Integer,Integer> entry : entryList){
//
//                answer[i++] = entry.getValue();
//
//            }


            return answer;
        }

}
