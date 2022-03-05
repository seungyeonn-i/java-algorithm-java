public class BOJ_14888 {
//    public static void main(String args[]){
//
//    }
//
//    static int N,max,min;
//    static int[] nums,operators, order;
//
//    static int calculator(){
//        //nums,order
//        int value = nums[1];
//        for(int i=1;i<N-1;i++){
//           // value , order[i] nums[i+1]
//            if(order[i] == 1)
//                value = value + nums[i + 1];
//            if(order[i] == 2)
//                value = value - nums[i + 1];
//            if(order[i] == 3)
//                value = value * nums[i + 1];
//            if(order[i] == 4)
//                value = value / nums[i + 1];
//
//        }
//        return value;
//    }
//
//    static void rec_func(int k, int value){
//        if(k == N){
////            int value = calculator();
//            max = Math.max(max, value);
//            min = Math.min(min, value);
//        }else{
//            //k번째 연산자
//            for(int cand = 1; cand <= 4; cand++){
//                if(operators[cand] >= 1){
//                    operators[cand]--;  //used
//                    order[k] = cand;    //k번째 used
//
////                    rec_func(k+1,new_value);
//                    operators[cand]++;
//                    order[k] = cand;
//                    order[k] = 0;
//                }
//            }
//        }
//    }
}
