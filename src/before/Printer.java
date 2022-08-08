package before;

import java.util.*;

public class Printer {

    public static void main(String[] args) {

        int[] priorities = {2, 1, 3, 2};
        int location = 2;


        solution(priorities, location);

    }

    public static int solution(int[] priorities, int location) {


                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                int answer = 0;

                for (int i = 0; i < priorities.length; i++) {
                    pq.add(priorities[i]);
                }

                while (!pq.isEmpty()) {
                    for (int i = 0; i < priorities.length; i++) {
                        if (priorities[i] == pq.peek()) {
                            if (i == location) {
                                answer++;
                                return answer;
                            }
                            pq.poll();
                            answer++;
                        }
                    }
                }
                return -1;
            }
        }
