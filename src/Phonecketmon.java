import java.util.HashSet;
import java.util.Set;

public class Phonecketmon {

        public static void main(String[] args) {

            int[] nums = {3,3,3,3,3,3,2,1,2,3};

            System.out.println(solution(nums));
        }

        public static int solution(int [] nums) {
            int answer = 0;
            int N = nums.length/2;

            Set<Integer> bucket = new HashSet<Integer>();


            for(int i=0;i<nums.length;i++){
                bucket.add(nums[i]);
            }

            if(N < bucket.size())
                answer = N;
            else if(N >= bucket.size()){

                answer = N - (N - bucket.size());
            }


            return answer;

        }
}
