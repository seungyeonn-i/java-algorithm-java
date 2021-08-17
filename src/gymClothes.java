import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class gymClothes {

    public static void main(String[] args) {
        int[] l = {2, 4};
        int[] r = {1,3,5};
        System.out.println(solution(5, l, r));
    }


    static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        //sorting
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i]+1 == reserve[j]  || lost[i]-1 == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}



//        List<Integer> Lost = new ArrayList<>();
//        for (int element : lost) {
//            Lost.add(element);
//        }
//
//        List<Integer> Reserve = new ArrayList<>();
//        for (int element : reserve) {
//            Reserve.add(element);
//        }
//
//        ListIterator<Integer> LostItr = Lost.listIterator();
//        ListIterator<Integer> ReserveItr = Reserve.listIterator();
//
//
//        //중복 제거
//
//        System.out.println(Lost.size());
//        System.out.println(Reserve.size());
//
//        try {
//            while (LostItr.hasNext()) {
//
//                while (ReserveItr.hasNext()) {
//
//                    if (LostItr.next() == ReserveItr.next()) {
//                        LostItr.remove();
//                        ReserveItr.remove();
//                        break;
//                    }
//                }
//            }
//        }catch(NoSuchElementException e){
//
//        }
//
//
//        answer = n - Lost.size();   //최소 수업 가능 인원
//
//        for (int i = 0; i < Lost.size(); i++) {
//            for (int j = 0; j < Reserve.size(); j++) {
//
//                if(Lost.get(i) == Reserve.get(j)+1 || Lost.get(i) == Reserve.get(j)-1){
//                    Reserve.remove(j);
//                    answer +=1;
//
//                }
//            }
//        }
//        return answer;
//
//    }
//}
//    static int solution(int n, int[] lost, int[] reserve) {
//        int answer = 0;
//
//        List<Integer> Lost = Arrays.stream(lost).boxed().collect(Collectors.toList());
//        List<Integer> Reserve = Arrays.stream(reserve).boxed().collect(Collectors.toList());
//        List<Integer> check = null;
//
//        ListIterator<Integer> LostItr = Lost.listIterator();
//        ListIterator<Integer> ReserveItr = Reserve.listIterator();
//
//        //진짜 빌려줄 수 있는 사람
//        while(LostItr.hasNext()){
//            while(ReserveItr.hasNext()){
//                if(LostItr.next() == ReserveItr.next())
//                    Reserve.remove(ReserveItr.next());
//                    Lost.remove(LostItr.next());
//            }
//        }
//
//        answer = Reserve.size();
//
//        //check에 합치기
//        while(ReserveItr.hasNext()){
//            for(int i=0;i<n;i++){
//                if(i==ReserveItr.next()) {
//                    check.add(i,1);
//                }
//            }
//        }
//
//        while(LostItr.hasNext()){
//            Integer i = LostItr.next();
//            if (check.get(i) == 1){
//                answer += 1;
//                check.add(i,0);
//            }
//
//        }
//
//
//        return answer;
//
//    }




