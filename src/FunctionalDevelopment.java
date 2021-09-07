import java.util.*;

public class FunctionalDevelopment {

    public static void main(String[] args){

        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1};

        solution(progresses,speeds);

    }

    static int[] solution(int[] progresses, int[] speeds) {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = progresses.length - 1; i >= 0; i--)
            stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));

        List<Integer> s = new ArrayList<Integer>();

        while (!stack.isEmpty()) {
            int cnt = 1;

            int top = stack.pop();

            while (!stack.isEmpty() && stack.peek() <= top) {
                cnt++;
                stack.pop();
            }

            s.add(cnt);
        }

        int[] answer = new int[s.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = s.get(i);
        }

        return answer;
    }

}
//        int[] answer = {};
//
//        int[] check = {};
//
//        PriorityQueue<Integer> dev = new PriorityQueue<>();
////        Queue<Integer> dev = new LinkedList<>();
//
//        while(true) {
//            for (int i = 0; i < progresses.length - 1; i++) {
//                progresses[i] += speeds[i];
//
//                if (progresses[i] == 100) {
//                    dev.add(i);
//                }
//                if(dev.peek() == i){
//
//                }
//
//            }
//            if(dev.size() == progresses.length - 1)
//                break;
//        }
//
//
//
//        while(!dev.isEmpty()){
//            System.out.println(dev.poll());
//        }
//
//
//
//        return answer;
//    }
//}
