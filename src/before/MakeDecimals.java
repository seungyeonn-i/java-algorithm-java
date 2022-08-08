package before;

public class MakeDecimals {

    public static void main(String[] args) {

        int[] nums = {1,2,7,4,6};
        solution(nums);
        System.out.println("check" + solution(nums));
    }

    static int solution(int[] nums) {
        int answer = 0;

        int num = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){

                    num = nums[i]+nums[j]+nums[k];
                    System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);

                    if(isDecimal(num))  {
                        answer++;
                    }

                }
            }
        }
        return answer;
    }

    static boolean isDecimal(int num){
        for(int i=2;i<num;i++){
            if(num % i == 0)    return false;
        }
        return true;
    }
}